//package com.freedom.demo.apaas;
//
//import cn.hutool.core.io.FileUtil;
//import cn.hutool.core.util.StrUtil;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.freedom.demo.basics.MD5;
//import com.freedom.demo.basics.TranslateController;
//
//import javax.net.ssl.HttpsURLConnection;
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.TrustManager;
//import javax.net.ssl.X509TrustManager;
//import java.io.*;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.security.KeyManagementException;
//import java.security.NoSuchAlgorithmException;
//import java.security.cert.CertificateException;
//import java.security.cert.X509Certificate;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**
// * Description: 语言包翻译
// * 使用该方法将[originalFileDir]目录下的所有文件中的中文替换为指定语言之后存放在[translationFileDir]下
// * @version 1.0
// * @author huzhibo
// * @date 2022/12/13 16:47
// */
//public class LanguageTranslationService {
//
//    //原始文件存放路径
//    private static String originalFileDir = "C:\\Users\\hu\\Desktop\\临时\\中文\\front\\app\\";
//    //翻译之后文件存放路径
//    private static String translationFileDir = "C:\\Users\\hu\\Desktop\\临时\\中文\\front\\app\\";
//    //翻译后语言
//    private static String translationLanguage = "kor";
//    //百度翻译配置参数(过期之后需要重新申请)
//    private static String appId = "20230109001524322";
//    private static String securityKey = "g63hB1xJEWHfcEw82p2E";
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//        List<String> strings1 = FileUtil.listFileNames(originalFileDir);
//        String path = translationFileDir;
//        String pathold = translationFileDir;
//        for (String s : strings1) {
//            File file = new File(pathold + s);
//            File file2 = new File(path + s);
//            List<String> strings = FileUtil.readLines(file, "");
//            ArrayList<String> arrayList = new ArrayList<>();
//            for (String string : strings) {
//                arrayList.add(getChineseWords(string));
//
//            }
//            FileUtil.writeLines(arrayList, file2, "");
//            return;
//        }
//    }
//
//
//    /**
//     * 获取所有匹配到的中文
//     * @param oriText
//     * @return
//     */
//    public static String getChineseWords(String oriText) throws InterruptedException {
//        TransApi api = new TransApi(appId, securityKey);
//
//        if (oriText.isEmpty())
//            return "";
//        String reg = "[\u4E00-\u9FFF]+";
//        Pattern pattern = Pattern.compile(reg);
//        Matcher matcher = pattern.matcher(oriText);
//        while (matcher.find()) {
//            String group = matcher.group();
//            Thread.sleep(1000);
//            String transResult = api.getTransResult(group, "zh", translationLanguage);
//            String unicode = TranslateController.decodeUnicode(transResult);
//            JSONObject jsonObject = JSONObject.parseObject(unicode);
//            JSONArray transResult1 = jsonObject.getJSONArray("trans_result");
//            if (transResult1.size() != 0) {
//                JSONObject a = transResult1.getJSONObject(0);
//                String dst = a.getString("dst");
//                oriText = StrUtil.replace(oriText, group, dst);
//            }
//        }
//        return oriText;
//    }
//}
//class TransApi {
//    private static final String TRANS_API_HOST = "http://api.fanyi.baidu.com/api/trans/vip/translate";
//
//    private String appid;
//    private String securityKey;
//
//    public TransApi(String appid, String securityKey) {
//        this.appid = appid;
//        this.securityKey = securityKey;
//    }
//
//    public String getTransResult(String query, String from, String to) {
//        Map<String, String> params = buildParams(query, from, to);
//        return HttpGet.get(TRANS_API_HOST, params);
//    }
//
//    private Map<String, String> buildParams(String query, String from, String to) {
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("q", query);
//        params.put("from", from);
//        params.put("to", to);
//
//        params.put("appid", appid);
//
//        // 随机数
//        String salt = String.valueOf(System.currentTimeMillis());
//        params.put("salt", salt);
//
//        // 签名
//        String src = appid + query + salt + securityKey; // 加密前的原文
//        params.put("sign", MD5.md5(src));
//
//        return params;
//    }
//
//}
//class HttpGet {
//    protected static final int SOCKET_TIMEOUT = 10000; // 10S
//    protected static final String GET = "GET";
//
//    public static String get(String host, Map<String, String> params) {
//        try {
//            // 设置SSLContext
//            SSLContext sslcontext = SSLContext.getInstance("TLS");
//            sslcontext.init(null, new TrustManager[] { myX509TrustManager }, null);
//
//            String sendUrl = getUrlWithQueryString(host, params);
//
//            // System.out.println("URL:" + sendUrl);
//
//            URL uri = new URL(sendUrl); // 创建URL对象
//            HttpURLConnection conn = (HttpURLConnection) uri.openConnection();
//            if (conn instanceof HttpsURLConnection) {
//                ((HttpsURLConnection) conn).setSSLSocketFactory(sslcontext.getSocketFactory());
//            }
//
//            conn.setConnectTimeout(SOCKET_TIMEOUT); // 设置相应超时
//            conn.setRequestMethod(GET);
//            int statusCode = conn.getResponseCode();
//            if (statusCode != HttpURLConnection.HTTP_OK) {
//                System.out.println("Http错误码：" + statusCode);
//            }
//
//            // 读取服务器的数据
//            InputStream is = conn.getInputStream();
//            BufferedReader br = new BufferedReader(new InputStreamReader(is));
//            StringBuilder builder = new StringBuilder();
//            String line = null;
//            while ((line = br.readLine()) != null) {
//                builder.append(line);
//            }
//
//            String text = builder.toString();
//
//            close(br); // 关闭数据流
//            close(is); // 关闭数据流
//            conn.disconnect(); // 断开连接
//
//            return text;
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (KeyManagementException e) {
//            e.printStackTrace();
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    public static String getUrlWithQueryString(String url, Map<String, String> params) {
//        if (params == null) {
//            return url;
//        }
//
//        StringBuilder builder = new StringBuilder(url);
//        if (url.contains("?")) {
//            builder.append("&");
//        } else {
//            builder.append("?");
//        }
//
//        int i = 0;
//        for (String key : params.keySet()) {
//            String value = params.get(key);
//            if (value == null) { // 过滤空的key
//                continue;
//            }
//
//            if (i != 0) {
//                builder.append('&');
//            }
//
//            builder.append(key);
//            builder.append('=');
//            builder.append(encode(value));
//
//            i++;
//        }
//
//        return builder.toString();
//    }
//
//    protected static void close(Closeable closeable) {
//        if (closeable != null) {
//            try {
//                closeable.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    /**
//     * 对输入的字符串进行URL编码, 即转换为%20这种形式
//     *
//     * @param input 原文
//     * @return URL编码. 如果编码失败, 则返回原文
//     */
//    public static String encode(String input) {
//        if (input == null) {
//            return "";
//        }
//
//        try {
//            return URLEncoder.encode(input, "utf-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        return input;
//    }
//
//    private static TrustManager myX509TrustManager = new X509TrustManager() {
//
//        @Override
//        public X509Certificate[] getAcceptedIssuers() {
//            return null;
//        }
//
//        @Override
//        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//        }
//
//        @Override
//        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//        }
//    };
//
//}

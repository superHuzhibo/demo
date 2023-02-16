package com.freedom.demo.apaas;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.HashMap;

/**
 * Description: 调用apaas接口示例(带鉴权)
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/14 15:50
 */
public class ApaasOpenService {

    /**
     * 使用到的pom(版本可以自己定义)
     *
     <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-web</artifactId>
     <version>2.3.7.RELEASE</version>
     </dependency>
     <dependency>
     <groupId>com.alibaba</groupId>
     <artifactId>fastjson</artifactId>
     <version>1.2.76</version>
     </dependency>
     *
     *
     *
     *
     */

    private static final RestTemplate REST_TEMPLATE = new RestTemplate();

    // 固定值 - 应用前缀地址
    private static final String PIX_URL = "http://10.10.10.101:30612";
    // 固定值 - 应用key
    private static final String APP_KEY = "6eb5bf76-9c19-4f93-ad10-76353ff507df";
    // 固定值 - 应用secret
    private static final String APP_SECRET = "486c89d5-8b1d-4534-80ca-fa92533ad0a0";
    // 固定值 - 应用租户id
    private static final String TENANT_ID = "350314382405664769";

    // 非固定值 - 登录用户id(如果未提供获取规则,则默认为)
    private static final String USER_ID = "100169876816012509184";
    // 非固定值 - 实际需要请求地址
    private static final String SEND_URL = "/xdap-app/msg/count/newAppMessage?timestamp=1667205000054";

    public static void main(String[] args) {
        String token = tokenGen(USER_ID);
        HashMap<Object, Object> sendMap = new HashMap<>();
        sendMap.put("appId","321954666386554880");
        send(token,sendMap);
    }
    /**
     * Description: 实际请求
     * @author huzhibo
     * @param token 用户token
     * @param object 请求参数
     */
    private static void send(String token,Object object) {
        String post = post(PIX_URL + SEND_URL, object, buildRequestHeaders( token));
        System.out.println(post);
    }

    /**
     * 构建apaas请求header
     * @return 请求鉴权参数
     */
    private static HttpHeaders buildRequestHeaders(String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json;charset=utf-8");
        headers.add("Accept", "application/json;charset=utf-8");
        headers.add("xdaptenantid", TENANT_ID);
        headers.add("xdaptoken", token);
        headers.add("xdaptimestamp", String.valueOf(System.currentTimeMillis()));
        return headers;
    }


    private static String tokenGen(String userId) {
        JSONObject post =
                post(PIX_URL + "/xdap-open/token?grant_type=client_credentials" +
                        "&client_id=" + APP_KEY + "&client_secret=" + APP_SECRET, new HashMap<>());
        String accessToken = post.get("access_token").toString();
        String tokenJson = get(PIX_URL + "/xdap-open/token/userToken?token=" + accessToken + "&userId=" + userId);
        JSONObject jsonObject = JSONObject.parseObject(tokenJson);
        return jsonObject.get("access_token").toString();
    }


    /**
     * 发送POST JSON请求(携带鉴权)
     *
     * @param url         请求地址
     * @param data        请求数据
     * @param requestHeaders 请求头
     */
    public static String post(String url, Object data, HttpHeaders requestHeaders) {
        HttpEntity<Object> requestEntity = new HttpEntity<>(JSONObject.parseObject(JSONObject.toJSONString(data)), requestHeaders);
        return REST_TEMPLATE.postForObject(url, requestEntity, String.class);
    }

    /**
     * 发送POST JSON请求
     *
     * @param url  请求地址
     * @param data 请求数据
     */
    public static JSONObject post(String url, Object data) {
        return post(url, JSONObject.parseObject(JSONObject.toJSONString(data)), JSONObject.class);
    }

    /**
     * 发送POST JSON请求
     *
     * @param url         请求地址
     * @param data        请求数据
     * @param returnClass 返回类型
     */
    public static <T> T post(String url, Object data, Class<T> returnClass) {
        String resultStr = REST_TEMPLATE.postForObject(url, JSONObject.parseObject(JSONObject.toJSONString(data)), String.class);
        return JSON.parseObject(resultStr, returnClass);
    }

    /**
     * 发送GET请求
     */
    public static String get(String url) {
        return REST_TEMPLATE.getForObject(URI.create(url), String.class);
    }
}

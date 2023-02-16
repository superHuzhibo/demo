package com.freedom.demo.apaas;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.HashMap;

/**
 * Description: apaas免登
 * @version 1.0
 * @author huzhibo
 * @date 2022/9/22 22:12
 */
public class NoLoginService {

    public static void main(String[] args) {
        parameterByAccount();
//        parameterByUserId();
    }

    private static void parameterByAccount(){
        //平台后端地址
        String platformUrl = "https://apaas.ronbaymat.com";
        //应用地址
        String appUrl = "https://crm.ronbaymat.com/app/";
        //账号
        String userAccount = "17621440039";
        //租户id
        String tenatId = "391171195904458753";
        System.out.println(noLoginByUserAccount(platformUrl, appUrl, userAccount, tenatId));
    }

    private static void parameterByUserId(){
        //应用后端地址
        String appUrl = "http://apaas.ynby.cn:30612/app/";
        //应用key和secret
        String appKey = "ed33b199-8235-4149-917b-d699b5aad182";
        String appSecret = "dcaf64ed-e87f-435a-8323-fa52bb1970c9";
        //用户id.常用 白药prod-陆杰-100337938505902587904,白药prod-李雪-100337938405767774208
        String userId = "100337938505902587904";
        System.out.println(noLoginByUserAccount(appUrl, appKey, appSecret, userId));
    }

    private static void noLoginByUserId(String appUrl,String appKey,String appSecret,String userId){
        String host = appUrl.replace("/app/", "").replace("/m/", "");
        JSONObject post =
                post(host + "/xdap-open/token?grant_type=client_credentials" +
                        "&client_id="+appKey+"&client_secret="+ appSecret,new HashMap<>());
        String accessToken = post.get("access_token").toString();
        String tokenJson = get(host + "/xdap-open/token/userToken?token=" + accessToken + "&userId=" + userId);
        JSONObject jsonObject = JSONObject.parseObject(tokenJson);
        String token = jsonObject.get("access_token").toString();
        String s = appUrl + "?xdaptoken=" + token;
        System.out.println(s);
    }

    private static String noLoginByUserAccount(String platformUrl,String appUrl, String userAccount,String tenatId ){
        String token = get(platformUrl + "/xdap-app/process/get/tokenByUserAccount?userAccount=" + userAccount + "&tenantId=" + tenatId);
        return appUrl + "?xdaptoken=" + token;
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
       RestTemplate restTemplate = new RestTemplate();
        String resultStr = restTemplate.postForObject(url, JSONObject.parseObject(JSONObject.toJSONString(data)), String.class);
        return JSON.parseObject(resultStr, returnClass);
    }

    /**
     * 发送GET请求
     */
    public static String get(String url) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URI.create(url), String.class);
    }

}

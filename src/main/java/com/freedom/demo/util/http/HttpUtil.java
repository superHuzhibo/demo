package com.freedom.demo.util.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/**
 * Description: http请求类
 * 需要引用pom文件(该pom文件是在get请求需要携带body时候触发,如果不需要,可以注释掉 getOfBody 方法)
 *         <dependency>
 *             <groupId>org.apache.httpcomponents</groupId>
 *             <artifactId>httpclient</artifactId>
 *             <version>4.5.12</version>
 *         </dependency>
 *
 * @version 1.0
 * @author huzhibo
 * @date 2022/4/22 10:01
 */
@Slf4j
public class HttpUtil {

    private static final RestTemplate REST_TEMPLATE = new RestTemplate();

    static {
        REST_TEMPLATE.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
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
        log.info("发送HTTP post请求 url: {},data: {}", url, data);
        String resultStr = REST_TEMPLATE.postForObject(url, JSONObject.parseObject(JSONObject.toJSONString(data)), String.class);
        log.info("HTTP POST请求返回数据: {}", resultStr);
        return JSON.parseObject(resultStr, returnClass);
    }



    /**
     * 发送POST JSON请求(携带鉴权)
     *
     * @param url         请求地址
     * @param data        请求数据
     * @param requestHeaders 请求头
     * @param returnClass 返回类型
     */
    public static <T> T post(String url, Object data, HttpHeaders requestHeaders, Class<T> returnClass) {
        log.info("发送HTTP post请求 url: {},data: {},header:{}", url, JSONObject.toJSONString(data),requestHeaders);
        HttpEntity<Object> requestEntity =new HttpEntity<>(JSONObject.parseObject(JSONObject.toJSONString(data)),requestHeaders);
        String resultStr = REST_TEMPLATE.postForObject(url, requestEntity, String.class);
        log.info("HTTP POST请求返回数据: {}", resultStr);
        return JSON.parseObject(resultStr, returnClass);
    }
    /**
     * 发送POST JSON请求(携带鉴权)
     *
     * @param url         请求地址
     * @param data        请求数据
     * @param requestHeaders 请求头
     */
    public static String post(String url, Object data, HttpHeaders requestHeaders) {
        log.info("发送HTTP post请求 url: {},data: {},header:{}", url, JSONObject.toJSONString(data),requestHeaders);
        HttpEntity<Object> requestEntity =new HttpEntity<>(JSONObject.parseObject(JSONObject.toJSONString(data)),requestHeaders);
        String resultStr = REST_TEMPLATE.postForObject(url, requestEntity, String.class);
        log.info("HTTP POST请求返回数据: {}", resultStr);
        return resultStr;
    }
    /**
     * 发送POST JSON请求(携带鉴权)
     *
     * @param url         请求地址
     * @param requestHeaders 请求头
     */
    public static String post(String url, HttpHeaders requestHeaders, Object... uriVariables) {
        log.info("发送HTTP post请求 url: {},data: {},header:{}", url,uriVariables, requestHeaders);
        HttpEntity<Object> requestEntity =new HttpEntity<>(JSONObject.parseObject(JSONObject.toJSONString(new HashMap<>())),requestHeaders);
        String resultStr = REST_TEMPLATE.postForObject(url, requestEntity, String.class,uriVariables);
        log.info("HTTP POST请求返回数据: {}", resultStr);
        return resultStr;
    }

    /**
     * 发送POST PARAM请求(携带鉴权)
     *
     * @param url         请求地址
     * @param data        请求数据
     * @param requestHeaders 请求头
     */
    public static String postParam(String url, Object data, HttpHeaders requestHeaders) {
        requestHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        log.info("发送HTTP post请求 url: {},data: {},header:{}", url, JSONObject.toJSONString(data),requestHeaders);
        HttpEntity<Object> requestEntity =new HttpEntity<>(JSONObject.parseObject(JSONObject.toJSONString(data)),requestHeaders);
        ResponseEntity<String> response = REST_TEMPLATE.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String resultStr = response.getBody();
        log.info("HTTP POST请求返回数据: {}", resultStr);
        return resultStr;
    }
    /**
     * 发送GET请求
     */
    public static <T> T get(String url, Class<T> returnClass) {
        log.info("发送HTTP GET请求 url: {}", url);
        String resultStr = REST_TEMPLATE.getForObject(URI.create(url), String.class);
        log.info("HTTP GET请求返回数据: {}", resultStr);
        return JSON.parseObject(resultStr, returnClass);
    }
    /**
     * Description: 推送get请求(参数以body的格式推送)
     * @author huzhibo
     * @date 2022/11/16 8:46
     */
    public static String getOfBody(String url,Object data,HttpHeaders headers){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(new HttpComponentsClientRestfulHttpRequestFactory());
        HttpEntity<String> httpEntity = new HttpEntity<>(JSON.toJSONString(data), headers);
        log.info("发送HTTP post请求 url: {},data: {},header:{}", url, JSONObject.toJSONString(data),headers);
        ResponseEntity<String> exchange =
                restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
        log.info("HTTP POST请求返回数据: {}", JSONObject.toJSONString(exchange));
        return exchange.getBody();
    }
    /**
     * 发送GET请求(携带鉴权)
     *
     * @param url         请求地址
     * @param data        请求数据
     * @param requestHeaders 请求头
     * @param returnClass 返回类型
     */
    public static <T> T get(String url, Object data, HttpHeaders requestHeaders, Class<T> returnClass) {
        log.info("发送HTTP get请求 url: {},data: {}", url, data);
        HttpEntity<Object> requestEntity =new HttpEntity<>(data,requestHeaders);
        ResponseEntity<T> exchange = REST_TEMPLATE.exchange(url, HttpMethod.GET, requestEntity, returnClass);
        log.info("HTTP GET请求返回数据: {}", exchange);
        return exchange.getBody();
    }
    /**
     * 发送GET PARAM请求(携带鉴权)
     *
     * @param url 请求地址
     */
    public static String getForParam(String url, Object... objects) {
        log.info("发送HTTP get请求 url: {},data: {}", url, objects);
        String result = REST_TEMPLATE.getForObject(url, String.class, objects);
        log.info("HTTP GET请求返回数据: {}", result);
        return result;
    }

    /**
     * 发送post表单请求
     */
    public static <T> T postFormData(String url, MultiValueMap<String, Object> data, Class<T> returnClass) {
        log.info("发送HTTP POST 表单请求 url: {} ,data: {}", url, data);
        String resultStr = REST_TEMPLATE.postForObject(url, data, String.class);
        log.info("HTTP POST表单请求返回数据: {}", resultStr);
        return JSON.parseObject(resultStr, returnClass);
    }
    /**
     * 发送post xml请求
     */
    public static String postXml(String url, String xmlString) {
        log.info("发送HTTP POST XML 请求 url: {} ,data: {}", url, xmlString);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_XML);
        String resultStr = REST_TEMPLATE.postForObject(url, new HttpEntity<>(xmlString, httpHeaders), String.class);
        log.info("HTTP POST XML返回数据: {}", resultStr);
        return resultStr;
    }

    /**
     * 发送post请求,不携带参数
     */
    public static String postNoData(String url,HttpHeaders headers){
        log.info("发送HTTP POST请求 url: {} ", url);
        String result = REST_TEMPLATE.postForObject(url, headers, String.class);
        log.info("发送HTTP POST请求 返回的数据: {} ", result);
        return result;
    }

}

package com.freedom.demo.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Description: 项目启动或者注销时调用方式
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/16 10:08
 */
@Component
public class PostConstructConfig{
    /**
     * 项目启动时调用该方法
     */
    @PostConstruct
    public void postconstructTest(){
        System.out.println("----项目启动----");
    }
    /**
     * 项目停止时候调用 ---- 停止的时候不调用,放弃了.
     */
//    @PreDestroy
//    public void destoryTest() {
//        System.out.println("----项目停止----");
//    }

}

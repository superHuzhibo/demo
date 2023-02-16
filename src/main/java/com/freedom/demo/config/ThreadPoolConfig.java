package com.freedom.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;

/**
 * Description: 线程池配置类
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/16 11:23
 */
@Configuration
public class ThreadPoolConfig {
    /**
     * 设置核心线程数  理想的线程数，使用 2倍cpu核心数
     */
    int corePoolSize = Runtime.getRuntime().availableProcessors() * 2;
    /**
     * 设置最大线程数
     */
    int maxPoolSize = Runtime.getRuntime().availableProcessors() * 2;
    /**
     * 设置工作队列大小
     */
    int queueCapacity = 2000;
    /**
     * 最大存活时间
     */
    long keepAliveTime = 30;
    /**
     * 设置线程名称前缀
     */
    String threadNamePrefix = "myThreadPool-->";

    @Bean
    public Executor myThreadPool() {
        // 设置自定义拒绝策略.当工作队列已满,线程数为最大线程数的时候,接收新任务抛出RejectedExecutionException异常
        RejectedExecutionHandler rejectedExecutionHandler = (r, executor) -> {
            throw new RejectedExecutionException("自定义的RejectedExecutionHandler");
        };
        // 自定义线程工厂
        ThreadFactory threadFactory = new ThreadFactory() {
            private int i = 1;
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName(threadNamePrefix + i);
                i++;
                return thread;
            }
        };
        // 初始化线程池
        return new ThreadPoolExecutor(corePoolSize, maxPoolSize,
                keepAliveTime, TimeUnit.SECONDS, new LinkedBlockingQueue<>(queueCapacity),
                threadFactory, rejectedExecutionHandler);
    }
}

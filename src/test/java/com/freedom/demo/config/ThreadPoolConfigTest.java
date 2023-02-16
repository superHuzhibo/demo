package com.freedom.demo.config;

import com.freedom.demo.util.ThreadUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Executor;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Description:
 * ①ArrayBlockingQueue
 * 基于数组的有界阻塞队列，按FIFO排序。新任务进来后，会放到该队列的队尾，有界的数组可以防止资源耗尽问题。当线程池中线程数量达到corePoolSize后，再有新任务进来，则会将任务放入该队列的队尾，等待被调度。如果队列已经是满的，则创建一个新线程，如果线程数量已经达到maxPoolSize，则会执行拒绝策略。
 * ②LinkedBlockingQuene
 * 基于链表的无界阻塞队列（其实最大容量为Interger.MAX），按照FIFO排序。由于该队列的近似无界性，当线程池中线程数量达到corePoolSize后，再有新任务进来，会一直存入该队列，而基本不会去创建新线程直到maxPoolSize（很难达到Interger.MAX这个数），因此使用该工作队列时，参数maxPoolSize其实是不起作用的。
 * ③SynchronousQuene
 * 一个不缓存任务的阻塞队列，生产者放入一个任务必须等到消费者取出这个任务。也就是说新任务进来时，不会缓存，而是直接被调度执行该任务，如果没有可用线程，则创建新线程，如果线程数量达到maxPoolSize，则执行拒绝策略。
 * ④PriorityBlockingQueue
 * 具有优先级的无界阻塞队列，优先级通过参数Comparator实现。
 *
 * handler 拒绝策略
 * ①CallerRunsPolicy
 * 该策略下，在调用者线程中直接执行被拒绝任务的run方法，除非线程池已经shutdown，则直接抛弃任务
 * ②AbortPolicy
 * 该策略下，直接丢弃任务，并抛出RejectedExecutionException异常。
 * ③DiscardPolicy
 * 该策略下，直接丢弃任务，什么都不做
 * ④DiscardOldestPolicy
 * 该策略下，抛弃进入队列最早的那个任务，然后尝试把这次拒绝的任务放入队列
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/16 12:16
 */
@SpringBootTest
class ThreadPoolConfigTest {
    @Autowired
    private Executor myThreadPool;
    @Test
    public void threadTest(){
        for (int i = 0; i < 10; i++) {
            myThreadPool.execute(new TestThread());
        }
        ThreadUtil.sleep(30000);
    }
    @Slf4j
    static class TestThread implements Runnable{

        @Override
        public void run() {
            log.info("线程开始执行");
            ThreadUtil.sleep(3000);
            log.info("线程执行结束");
        }
    }

}
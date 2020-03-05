package main.java.cn.itheima.demo06;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lyb
 * @date 2020/3/5
 */
public class Demo01UseExecutorsPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            Runnable run = new RunnalableImpl();
            executorService.submit(run);
        }
    }
}

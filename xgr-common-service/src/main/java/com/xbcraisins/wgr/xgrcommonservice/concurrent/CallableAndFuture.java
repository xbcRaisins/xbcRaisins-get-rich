package com.xbcraisins.wgr.xgrcommonservice.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/3/24 21:57
 */
public class CallableAndFuture {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        //提交一个任务，有返回值
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<String> future = service.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return "www.itcast.cn";
            }

        });
        System.out.println("task has been committed");
        System.out.println(future.get());

        //提交多个任务
        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(service);
        for (int i = 0; i < 10; i++) {
            final Integer sequence = i + 1;
            completionService.submit(new Callable<Integer>() {

                @Override
                public Integer call() throws Exception {

                    try {
                        Thread.sleep((long) (Math.random() * 1000));//随机数让每次任务执行间隔时间不同
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    return sequence;
                }

            });
        }

        for (int i = 0; i < 10; i++) {
            Future<Integer> f = completionService.take();
            System.out.println(f.get());
        }

    }

}

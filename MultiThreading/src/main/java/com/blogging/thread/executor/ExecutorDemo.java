package com.blogging.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("======== newSingleThreadExecutor ========");
        runService(Executors.newSingleThreadExecutor());
        Thread.sleep(2000);
        System.out.println("======== newFixedThreadPool ========");
        runService(Executors.newFixedThreadPool(4));
        Thread.sleep(2000);
        System.out.println("======== newCachedThreadPool ========");
        runService(Executors.newCachedThreadPool());
        Thread.sleep(2000);
        System.out.println("======== newScheduledThreadPool ========");
        runService(Executors.newScheduledThreadPool(2));
    }

    private static void runService(ExecutorService executorService) {
        for(int index = 1; index <= 5; index++) {
            executorService.submit(() -> {
                String currentThreadName = Thread.currentThread().getName();
                System.out.println(currentThreadName);
            });
        }
        executorService.shutdown();
    }
}

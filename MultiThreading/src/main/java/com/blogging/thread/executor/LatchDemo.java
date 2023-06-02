package com.blogging.thread.executor;

import java.util.concurrent.CountDownLatch;

/**
 * If count down latch's count value is greater than tasks being processed
 * then it'll freeze the application at await() method.
 */
public class LatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for(int index = 1; index <= 5; index++) {
            new Thread(() -> {
                System.out.println("Processing thread name - " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println("Done!");
    }
}

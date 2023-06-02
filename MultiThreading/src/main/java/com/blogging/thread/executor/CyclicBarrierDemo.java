package com.blogging.thread.executor;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, () -> {
            System.out.println("All threads have done doing their work!");
        });
        for(int index = 1; index <= 5; index++) {
            executorService.execute(new Worker(index, cyclicBarrier));
        }
        executorService.shutdown();
    }

    private static class Worker implements Runnable {

        private int id;
        private CyclicBarrier cyclicBarrier;

        public Worker(int id, CyclicBarrier cyclicBarrier) {
            this.id = id;
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println("Doing something on thread id: " + id);
            try {
                Thread.sleep(2000);
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
            System.out.println("All threads have completed their work so now I am going. Thread id: " + id);
        }
    }
}

package com.blogging.thread;

/**
 * Because of the intrinsic lock (lock on same object), notify and wait are able to communicate
 * with different threads.
 */
public class WaitNotifyDemo {

    public static void main(String[] args) {
        WaitNotifyDemo waitNotifyDemo = new WaitNotifyDemo();
        new Thread(() -> {
            waitNotifyDemo.producer();
        }).start();
        new Thread(() -> {
            waitNotifyDemo.consumer();
        }).start();
    }

    private void producer() {
        synchronized (this) {
            System.out.println("Started producing...");
            try {
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Production completed!");
        }
    }

    private void consumer() {
        synchronized (this) {
            System.out.println("Started consuming...");
            notify();
            System.out.println("Consumption completed!");
        }
    }
}

package com.blogging.thread;

/**
 * Demonstrating that Daemon threads are low priority threads. They are terminated by JVM.
 * As soon as the worker thread's task is completed and died, JVM killed the Daemon thread as well.
 */
public class DaemonDemo {

    public static void main(String[] args) {
        Thread workerThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Worker thread finishes!");
        });

        Thread daemonThread = new Thread(() -> {
            while(true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Daemon thread is running!");
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();
        workerThread.start();
    }

}

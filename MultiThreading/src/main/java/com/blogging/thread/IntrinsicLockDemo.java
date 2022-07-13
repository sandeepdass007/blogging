package com.blogging.thread;

public class IntrinsicLockDemo {

    public static void main(String[] args) {
        nonIntrinsicDemo();
        intrinsicDemo();
    }

    /**
     * In this case, the object being used is same so when first thread started executing
     * it took the lock automatically on the object <b>intrinsicLockDemo</b> due to which
     * it is not able to call the other synchronized method in parallel even though it has
     * its own thread.
     */
    private static void intrinsicDemo() {
        System.out.println("======== Intrinsic Demo ========");
        IntrinsicLockDemo intrinsicLockDemo = new IntrinsicLockDemo();
        Thread thread1 = new Thread(() -> {
            intrinsicLockDemo.displayNumbers(10);
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            intrinsicLockDemo.displayEvenNumbers(20);
        });
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void nonIntrinsicDemo() {
        System.out.println("======== Non-Intrinsic Demo ========");
        Thread thread1 = new Thread(() -> {
            new IntrinsicLockDemo().displayNumbers(10);
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            new IntrinsicLockDemo().displayEvenNumbers(20);
        });
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized void displayNumbers(int size) {
        for(int number = 1; number <= size; number++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Number: " + number);
        }
    }

    private synchronized void displayEvenNumbers(int size) {
        for(int number = 1; number <= size; number++) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(number % 2 == 0) {
                System.out.println("Even Number: " + number);
            }
        }
    }
}

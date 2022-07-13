package com.blogging.thread;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemo {

    private final List<Integer> numbers = new LinkedList<>();
    private final Integer UPPER_LIMIT = 5;
    private final Integer LOWER_LIMIT = 0;
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public static void main(String[] args) {
        ReentrantDemo reentrantDemo = new ReentrantDemo();

        new Thread(() -> {
            try {
                reentrantDemo.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                reentrantDemo.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    private void produce() throws InterruptedException {
        try {
            lock.lock();
            while (true) {
                if (numbers.size() == UPPER_LIMIT) {
                    System.out.println("Waiting for elements to remove...");
                    condition.await();
                } else {
                    System.out.println("Adding: " + number);
                    numbers.add(number++);
                    condition.signal();
                }
                Thread.sleep(500);
            }
        } finally {
            lock.unlock();
        }
    }

    private void consume() throws InterruptedException {
        try {
            lock.lock();
            while (true) {
                if (numbers.size() == LOWER_LIMIT) {
                    System.out.println("Waiting for elements to add...");
                    condition.await();
                } else {
                    System.out.println("Removing: " + (--number));
                    numbers.remove(numbers.size() - 1);
                    condition.signal();
                }
                Thread.sleep(500);
            }
        } finally {
            lock.unlock();
        }
    }
}

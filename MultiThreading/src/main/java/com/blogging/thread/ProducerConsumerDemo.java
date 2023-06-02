package com.blogging.thread;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerDemo {

    private final List<Integer> numbers = new LinkedList<>();
    private final Integer UPPER_LIMIT = 5;
    private final Integer LOWER_LIMIT = 0;
    private int number = 0;
    Object monitor = new Object();

    public static void main(String[] args) {
        ProducerConsumerDemo producerConsumerDemo = new ProducerConsumerDemo();

        new Thread(() -> {
            try {
                producerConsumerDemo.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                producerConsumerDemo.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    private void produce() throws InterruptedException {
        synchronized (monitor) {
            while(true) {
                if(numbers.size() == UPPER_LIMIT) {
                    System.out.println("Waiting for elements to remove...");
                    monitor.wait();
                } else {
                    System.out.println("Adding: " + number);
                    numbers.add(number++);
                    monitor.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    private void consume() throws InterruptedException {
        synchronized (monitor) {
            while(true) {
                if(numbers.size() == LOWER_LIMIT) {
                    System.out.println("Waiting for elements to add...");
                    monitor.wait();
                } else {
                    System.out.println("Removing: " + (--number));
                    numbers.remove(numbers.size() - 1);
                    monitor.notify();
                }
                Thread.sleep(500);
            }
        }
    }
}

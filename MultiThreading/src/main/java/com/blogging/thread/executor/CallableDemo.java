package com.blogging.thread.executor;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<String> words = Arrays.asList("hello", "how", "are", "you?", "how", "is", "everything", "going", "on?");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new LinkedList<>();
        for(String word : words) {
            Future<String> future = executorService.submit(new Processor(word));
            futures.add(future);
        }

        for(Future<String> future : futures) {
            System.out.println(future.get());
        }
        executorService.shutdown();
    }

    private static class Processor implements Callable<String> {
        private String word;

        public Processor(String word) {
            this.word = word;
        }

        @Override
        public String call() throws Exception {
            Thread.sleep(2000);
            String currentThreadName = Thread.currentThread().getName();
            System.out.println(String.format("%s is executing - %s", currentThreadName, word));
            return word.toUpperCase();
        }
    }
}

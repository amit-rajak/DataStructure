package com.datastructure.test;

public class EvenOddPrinting {

    private static int count = 1;
    private static final int MAX_COUNT = 10;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenPrinter(), "EvenThread");
        Thread oddThread = new Thread(new OddPrinter(), "OddThread");

        evenThread.start();
        oddThread.start();
    }

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count++);
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count++);
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

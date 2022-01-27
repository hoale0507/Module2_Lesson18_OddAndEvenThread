package com.company;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new OddThread();
        Thread thread2 = new EvenThread();

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();

    }
}

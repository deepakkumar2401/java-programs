package com.te.programs;

class SharedPrinter {
    private int counter = 1;
    private final int MAX;

    public SharedPrinter(int max) {
        this.MAX = max;
    }

    public synchronized void printOdd() {
        while (counter < MAX) {
            while (counter % 2 == 0) { // Wait if it's not odd
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Odd: " + counter);
            counter++;
            notify(); // Notify even thread
        }
    }

    public synchronized void printEven() {
        while (counter <= MAX) {
            while (counter % 2 != 0) { // Wait if it's not even
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Even: " + counter);
            counter++;
            notify(); // Notify odd thread
        }
    }
}

public class OddEvenThread {
    public static void main(String[] args) {
        int maxNumber = 10;
        SharedPrinter printer = new SharedPrinter(maxNumber);

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();
    }
}


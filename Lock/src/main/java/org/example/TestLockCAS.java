package org.example;

public class TestLockCAS {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        long start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000000; i++) {
                a.increaseAtomicInteger();
            }
        });
        t1.start();

        for (int i = 0; i < 10000000; i++) {
            a.increaseAtomicInteger();
        }

        t1.join();

        long end = System.currentTimeMillis();
        System.out.println(a.getAtomicInteger());
        System.out.println(end - start + "ms");
    }
}

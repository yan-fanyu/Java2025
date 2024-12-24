package org.example;

public class LockTest {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        long start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000000; i++) {
                a.increase();
            }
        });
        t1.start();

        for (int i = 0; i < 10000000; i++) {
            a.increase();
        }

        t1.join();

        long end = System.currentTimeMillis();
        System.out.println(a.getA());
        System.out.println(end - start + "ms");
    }
}

package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class A {
    // 重量级的锁
    private int a = 0;
    public void increase(){
        synchronized(this){
            this.a++;
        }
    }
    public int getA(){
        return this.a;
    }

    // 轻量级的锁
    private final AtomicInteger atomicInteger = new AtomicInteger(0);
    public void increaseAtomicInteger() {
        atomicInteger.incrementAndGet();
        // 上面的代码 类似于 下面的代码
//        while(true){
//            int oldValue = atomicInteger.get();
//            int newValue = oldValue + 1;
//            if(atomicInteger.compareAndSet(oldValue, newValue)){    // CAS
//                break;
//            }
//        }
    }
    public int getAtomicInteger() {
        return atomicInteger.get();
    }
}

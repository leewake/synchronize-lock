package com.pangpang.synchronize.test_this;

/**
 * Created by leewake on 2017/10/31 0031.
 */
public class SyncWithMethod {

    public synchronized void test() {
        System.out.println("在普通方法上使用synchronize加锁，test开始..");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("在普通方法上使用synchronize加锁，test结束..");
    }

}

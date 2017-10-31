package com.pangpang.synchronize.test_class;

/**
 * Created by leewake on 2017/10/31 0031.
 */
public class SyncWithStaticMethod {

    public static synchronized void test() {
        System.out.println("在static方法上使用synchronize加锁，test开始..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("在static方法上使用synchronize加锁，test结束..");
        System.out.println();
    }

}

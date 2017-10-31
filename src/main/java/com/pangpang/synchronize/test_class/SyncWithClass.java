package com.pangpang.synchronize.test_class;

/**
 * Created by leewake on 2017/10/31 0031.
 */
public class SyncWithClass {
    public void test() {
        synchronized (SyncWithClass.class){
            System.out.println("在方法内使用.class加锁，test开始..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("在方法内使用.class加锁，test结束..");
        }
    }

    public void callTest(){
        System.out.println("------调用test开始------");
        this.test();
        System.out.println("------调用test结束------");
    }
}

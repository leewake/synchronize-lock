package com.pangpang.synchronize.test_this;

/**
 * Created by leewake on 2017/10/31 0031.
 */
public class SyncWithThis {
    public void test() {
        synchronized (this){
            System.out.println("在方法内使用this加锁，test开始..");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("在方法内使用this加锁，test结束..");
        }
    }

    public void callTest(){
        System.out.println("------调用test开始------");
        this.test();
        System.out.println("------调用test结束------");
    }
}

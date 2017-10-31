package com.pangpang.synchronize.test_this;

/**
 * Created by leewake on 2017/10/31 0031.
 */
public class MyThread extends Thread {
    public void run(){
        SyncWithMethod syncWithMethod = new SyncWithMethod();
        syncWithMethod.test();

        SyncWithThis syncWithThis = new SyncWithThis();
        syncWithThis.test();
    }
}

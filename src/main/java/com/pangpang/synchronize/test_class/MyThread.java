package com.pangpang.synchronize.test_class;

/**
 * Created by leewake on 2017/10/31 0031.
 */
public class MyThread extends Thread {

    private SyncWithClass syncWithClass;

    private SyncWithStaticMethod syncWithStaticMethod;

    public MyThread(SyncWithClass syncWithClass, SyncWithStaticMethod syncWithStaticMethod) {
        this.syncWithClass = syncWithClass;
        this.syncWithStaticMethod = syncWithStaticMethod;
    }

    public void run() {
        syncWithClass.test();
        SyncWithStaticMethod.test();
    }

}

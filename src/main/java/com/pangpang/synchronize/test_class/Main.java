package com.pangpang.synchronize.test_class;

/**
 * Created by leewake on 2017/10/31 0031.
 */
public class Main {
    public static void main(String[] args) {

        SyncWithClass syncWithClass = new SyncWithClass();
        SyncWithStaticMethod syncWithStaticMethod = new SyncWithStaticMethod();

        for (int i = 0; i < 3; i++) {
            Thread thread = new MyThread(syncWithClass, syncWithStaticMethod);
            thread.start();
        }

        /*SyncWithThis syncWithThis = new SyncWithThis();
        syncWithThis.test();
        syncWithThis.callTest();*/
    }
}

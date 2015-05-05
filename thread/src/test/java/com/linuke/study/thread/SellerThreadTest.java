package com.linuke.study.thread;

import org.junit.Test;

/**
 * Created by linuke on 2015/4/7.
 */
public class SellerThreadTest {

    @Test
    public void test(){
        SellerThread st = new SellerThread();
        Thread t1 = new Thread(st);
        t1.start();
        Thread t2 = new Thread(st);
        t2.start();
        Thread t3 = new Thread(st);
        t3.start();
    }

    public static void main(String[] args) {
        SellerThread st = new SellerThread();
        Thread t1 = new Thread(st);
        t1.start();
        Thread t2 = new Thread(st);
        t2.start();
        Thread t3 = new Thread(st);
        t3.start();
    }
}

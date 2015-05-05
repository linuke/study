package com.linuke.study.thread;

/**
 * Created by linuke on 2015/4/7.
 */
public class SellerThread implements Runnable {

    private int ticket;

    private String lock = new String();

    public SellerThread() {
        ticket = 100;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see     Thread#run()
     */
    public void run() {
        while ( ticket > 0) {
            synchronized (lock){
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"ÔÚÂôµÚ "+ ticket -- +" Æ±");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

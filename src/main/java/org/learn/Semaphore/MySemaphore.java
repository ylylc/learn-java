package org.learn.Semaphore;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright © 2019 美利金融. All rights reserved.
 *
 * @author :  barry
 * Date: 2019-11-28
 * Time: 3:31 下午
 * @Description :
 */
public class MySemaphore {

    private volatile  int semaphoreCount;
    private final Lock lock = new ReentrantLock();
    private final Condition c = lock.newCondition();

    public MySemaphore (int semaphoreCount){
        this.semaphoreCount = semaphoreCount;
    }
    public  void   acquire(){
        try {
            lock.lock();
            if (semaphoreCount==0){
                c.await();
        }else {
            semaphoreCount--;
        } } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    /**
     * 是否获取
     */
    public  void release(){
        lock.lock();
        semaphoreCount++;
        c.signal();
        lock.unlock();
    }

    public static final void main(String strs []){
        final  MySemaphore mySemaphore = new MySemaphore(3);
        for (int i= 0;i<10;i++) {
            mySemaphore.acquire();
            Thread th = new Thread(new Runnable() {
                public void run() {
                    try {
                        System.out.println(111);
                        Thread.sleep(5000L);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    finally {
                        mySemaphore.release();
                    }

                }
            });
            th.start();
        }


    }

}

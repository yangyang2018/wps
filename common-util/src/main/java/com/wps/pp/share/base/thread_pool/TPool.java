package com.wps.pp.share.base.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by yangy on 2018/4/17.
 */
public class TPool {

///创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。


    public  static void produceCachedTPool(){
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int finalIndex = i;

            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("index"+ finalIndex +":"+Thread.currentThread().getName()+"  is working");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("index"+ finalIndex +":"+Thread.currentThread().getName()+"  is ending");
                }
            });

        }
    }

    public  static void produceFixedTPool(){
        ExecutorService cachedThreadPool = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            final int finalIndex = i;
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("index"+ finalIndex +":"+Thread.currentThread().getName()+"  is working");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("index"+ finalIndex +":"+Thread.currentThread().getName()+"  is ending");
                }
            });

        }
    }

    public  static void produceSingleTPool(){
        ExecutorService cachedThreadPool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int finalIndex = i;
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("index"+ finalIndex +":"+Thread.currentThread().getName()+"  is working");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (finalIndex==5) {
                        String str=null;
                        System.out.println(str.equals("ss"));
                    }
                    System.out.println("index"+ finalIndex +":"+Thread.currentThread().getName()+"  is ending");
                }
            });

        }
    }
    public  static void produceScheduleTPool(){
        ScheduledExecutorService cachedThreadPool = Executors.newScheduledThreadPool(5);
        cachedThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread"+Thread.currentThread().getName() +"is working");
            }
        },3, TimeUnit.SECONDS);

    }
    public  static void produceScheduleTPoolTwo(){
        ScheduledExecutorService cachedThreadPool = Executors.newScheduledThreadPool(5);
        cachedThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("delay 1 seconds, and excute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);

    }


    public static void main(String[] args) {
//        produceCachedTPool();
//        produceFixedTPool();
//        produceSingleTPool();
//        produceScheduleTPool();
          produceScheduleTPoolTwo();
    }





}

package com.wps.pp.share.base.extend;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Hello world!
 *
 */

class   CC {
    private boolean  ff;

    public boolean isFf() {
        return ff;
    }

    public void setFf(boolean ff) {
        this.ff = ff;
    }
}
public class App 
{

        public static void main(String[] args) throws Exception {
//        String s1 = new String("iByteCode");
//        System.out.println(s1);
//        CyclicBarrier barrier = new CyclicBarrier(2);
//        try {
//            barrier.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (BrokenBarrierException e) {
//            e.printStackTrace();
//        }
            CC cc =new CC();

            System.out.println(cc.isFf());
    }

}

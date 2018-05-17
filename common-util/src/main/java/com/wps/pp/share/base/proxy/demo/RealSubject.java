package com.wps.pp.share.base.proxy.demo;

import java.io.Serializable;

/**
 * Created by yangy on 2018/5/17.
 */
public class RealSubject implements Subject ,Serializable{

    private static final long serialVersionUID = 2766412940634776727L;

    @Override
    public void doSomething() {

        System.out.println("RealSubject do something .......");
    }
}

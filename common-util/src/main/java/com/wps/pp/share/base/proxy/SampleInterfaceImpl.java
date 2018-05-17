package com.wps.pp.share.base.proxy;

import java.io.Serializable;

/**
 * Created by yangy on 2018/5/17.
 */
public class SampleInterfaceImpl implements SampleInterface,Serializable {
    @Override
    public void showMessage(String msg) {
        System.out.println("SampleInterfaceImpl say hello !!!"+msg);
    }
}

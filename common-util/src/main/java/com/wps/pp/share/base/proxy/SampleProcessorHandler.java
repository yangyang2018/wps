package com.wps.pp.share.base.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yangy on 2018/5/17.
 */
public class SampleProcessorHandler implements InvocationHandler {

    private Object target = null;

    SampleProcessorHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        
        handleBefore();

        System.out.println(args.length);
        Object result =  method.invoke(target,args);
        handleAfter();
        return result;
    }

    private void handleAfter() {
        System.out.println("after before .........");
    }

    private void handleBefore() {

        System.out.println("invoke before .........");

    }
}

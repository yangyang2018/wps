package com.wps.pp.share.base.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * Created by yangy on 2018/5/17.
 */
public class Demo {


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Subject subject = new RealSubject();
        AdviceInterceptor  adviceInterceptor = new MyAdviceInterceptor();
        AdviceHandler adviceHandler = new AdviceHandler(subject,adviceInterceptor);

       /* Class subClass = Proxy.getProxyClass(subject.getClass().getClassLoader(),subject.getClass().getInterfaces());
        Subject  proxy = (Subject) subClass.getDeclaredConstructor(new Class[]{InvocationHandler.class}).newInstance(new Object[]{
                adviceHandler
        });*/



        Subject  proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),adviceHandler);

        proxy.doSomething();


    }
}

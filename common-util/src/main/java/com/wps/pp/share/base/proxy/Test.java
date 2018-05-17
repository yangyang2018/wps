package com.wps.pp.share.base.proxy;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.*;

/**
 * Created by yangy on 2018/5/17.
 */
public class Test {


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


        SampleInterfaceImpl sampleInterface = new SampleInterfaceImpl();

        SampleProcessorHandler handler = new SampleProcessorHandler(sampleInterface);

        System.out.println(JSON.toJSONString(SampleInterfaceImpl.class.getInterfaces()));

        Class proxyClass = Proxy.getProxyClass(SampleInterfaceImpl.class.getClassLoader(),SampleInterfaceImpl.class.getInterfaces());

        
        
        printProxyM(proxyClass);



        SampleInterface proxy = (SampleInterface) proxyClass.getConstructor(
                new Class[] { InvocationHandler.class }).newInstance(
                new Object[] { handler });


        System.out.println("22"+Proxy.getInvocationHandler(proxy).getClass().getName());
        System.out.println("22"+Proxy.getInvocationHandler(proxy).getClass().getSimpleName());
        proxy.showMessage("gggg");


    }

    private static void printProxyM(Class proxyClass) {

        Method[] declaredMethods = proxyClass.getDeclaredMethods();
        System.out.println("代理类的方法：");
        for (Method declaredMethod : declaredMethods) {

            System.out.println(declaredMethod.getName());
        }

        Field[] declaredFields = proxyClass.getDeclaredFields();
        System.out.println("代理类的属性：");
        for (Field declaredField : declaredFields) {

            System.out.println(declaredField.getName());

        }

    }
}

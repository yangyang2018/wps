package com.wps.pp.share.base.proxy.demo;

import java.util.Map;

/**
 * Created by yangy on 2018/5/17.
 */
public class MyAdviceInterceptor implements AdviceInterceptor {
    @Override
    public void breforeAdvice(Map<String, Object> map) {
        Object[] args = (Object[]) map.get("args");
        System.out.println("前置通知"+(args !=null&&args.length>0?args[0]:""));
    }

    @Override
    public void afterAdvice(Map<String, Object> map) {

        Object[] args = (Object[]) map.get("args");
        System.out.println("后置通知"+ (args !=null&&args.length>0?args[0]:""));

    }
}

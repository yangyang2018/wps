package com.wps.pp.share.base.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangy on 2018/5/17.
 */
public class AdviceHandler  implements InvocationHandler{

    private Subject subject;
    private AdviceInterceptor  adviceInterceptor;

    public AdviceHandler(Subject subject, AdviceInterceptor adviceInterceptor) {
        this.subject = subject;
        this.adviceInterceptor = adviceInterceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Map<String,Object> map = new HashMap<String, Object>();

        map.put("args",args);

        adviceInterceptor.breforeAdvice(map);

        Object rs = method.invoke(subject, args);

        adviceInterceptor.afterAdvice(map);

        return rs;
    }
}

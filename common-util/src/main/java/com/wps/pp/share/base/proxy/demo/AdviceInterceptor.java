package com.wps.pp.share.base.proxy.demo;

import java.util.Map;

/**
 *
 * 拦截器通知
 * Created by yangy on 2018/5/17.
 */
public interface AdviceInterceptor {

    /**
     * 前置通知
     * @param map
     */
    void  breforeAdvice(Map<String,Object> map);


    /**
     * 后置通知
     * @param map
     */
    void  afterAdvice(Map<String,Object> map);

}

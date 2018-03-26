package com.wps.pp.share.base;

/**
 * Created by yy on 2018/3/26.
 */
public class StringTest {

    public static  void formatTest(String name){
        String key = String.format("Asset:IntegeId:%s", String.valueOf(name));

        System.out.println(key);

        String key2 = String.format("c3name [%1s], integrationId[%2s],cann't found!", name, name);
        System.out.println(key2);
    }


    public static void main(String[] args) {
        formatTest("牟小华");



    }
}

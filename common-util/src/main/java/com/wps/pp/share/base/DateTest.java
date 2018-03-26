package com.wps.pp.share.base;

import java.util.Calendar;

/**
 * Created by yy on 2018/3/9.
 */
public class DateTest {

    public static void main(String[] args) {

        int date = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        System.out.println(date);

        float a=1.9f;
        System.out.println((int) a);
        int b=1;
        System.out.println(b>a);

    }
}

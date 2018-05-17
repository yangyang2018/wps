package com.wps.pp.share.base.utils;

import com.google.common.base.CaseFormat;
import com.google.common.base.Strings;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * Created by yangy on 2018/5/17.
 */
public class KeyUtils {

    public static <T> String entityCount(Class<T> entityClass) {
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, entityClass.getSimpleName()) + ":count";
    }

    public static <T> String entityId(Class<T> entityClass, final Object id) {
        return entityId(entityClass, String.valueOf(id));
    }

    public static <T> String entityId(Class<T> entityClass, final String id) {
        checkArgument(!Strings.isNullOrEmpty(id), "id can not be null");
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, entityClass.getSimpleName()) + ":" + id;
    }

    public static <T> String entityName(Class<T> entityClass){
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, entityClass.getSimpleName());
    }

    public static <T> String entityName(String className){
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, className);
    }

}

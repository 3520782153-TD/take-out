package com.it.reggie.common;

/**
 * 基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(long id){
        /**
         * 设置值
         */
        threadLocal.set(id);
    }
    public static Long getCurrentId(){
        /**
         * 获取值
         */
        return threadLocal.get();
    }
}

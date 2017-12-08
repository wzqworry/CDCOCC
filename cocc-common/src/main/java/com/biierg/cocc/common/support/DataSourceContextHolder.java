package com.biierg.cocc.common.support;

/**
 * Created by wzq on 2017/8/16.
 */
public class DataSourceContextHolder{
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDbType(String dbType) {
        contextHolder.set(dbType);
    }

    public static String getDbType() {
        return ((String) contextHolder.get());
    }

    public static void clearDbType() {
        contextHolder.remove();
    }
}

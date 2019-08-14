package com.swind.cloud.v2.common.util;

public class StringHelper {
    public static String getObjectValue(Object obj){
        return obj==null?"":obj.toString();
    }
}

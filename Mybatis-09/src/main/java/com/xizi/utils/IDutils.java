package com.xizi.utils;

import org.junit.Test;

import java.util.UUID;

@SuppressWarnings("all")//警告
public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IDutils.getId());
    }
}


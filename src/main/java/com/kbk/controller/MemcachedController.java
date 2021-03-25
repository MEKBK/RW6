package com.kbk.controller;

import com.whalin.MemCached.MemCachedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class MemcachedController {

//    @Autowired
//    private MemCachedClient memCachedClient;
//
//    @RequestMapping("/memcached")
//    public void setMemcachedServer(){
//        Boolean target=memCachedClient.set("1", "123456");
//        System.out.println("memcached 加载是否成功："+target);
//
//        String result =(String)memCachedClient.get("1");
//        System.out.println("memcached 获取的结果："+result);
//        memCachedClient.delete("1");
//    }
}

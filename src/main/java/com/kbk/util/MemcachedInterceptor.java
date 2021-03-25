package com.kbk.util;



import com.kbk.dao.ProfessionMapper;
import com.kbk.model.Profession;
import com.whalin.MemCached.MemCachedClient;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @ClassName MemcachedInterceptor
 * @Description
 * @Author 况博凯
 * @Date 2021/03/15 16：12
 * @Version 1.0
 */

//@Aspect
//@Component
public class MemcachedInterceptor {

//    public static final Logger log = LoggerFactory.getLogger(MemcachedInterceptor.class);
//
//    //将缓存客户端工具类 MemcachedCache 织入进来
//    @Autowired
//    private MemCachedClient memCachedClient;
//
//    @Autowired
//    ProfessionMapper professionMapper;
//
//    /**
//     * 定义pointcunt
//     */
//    @Pointcut("execution(* com.kbk.controller.*Controller.*(..)) || execution(* com.kbk.service.*Service.*(..))")
//    public void selectAll() {
//
//    }
//
//    /**
//     * 环绕装备 用于拦截查询 如果缓存中有数据，直接从缓存中读取；否则从数据库读取并将结果放入缓存
//     *
//     * @param
//     * @return
//     */
//    @Around("selectAll()")
//    public Profession selectAllAround(ProceedingJoinPoint joinPoint ) throws Exception {
//        Profession profession = null;
//        JSONArray jsonArray = JSONArray.fromObject(memCachedClient.get("professionList"));
//        try {
//            List<Profession> professionList = (List<Profession>) JSONArray.toCollection(jsonArray, Profession.class);
//            System.out.println("测试结果professionList:"+professionList);
//        if (professionList != null) {
//
//            log.debug("从缓存中读取！professionList"+professionList);
//        } else {
//                log.info("\n"+"从数据库中查询所有");
//                System.out.println("测试结果:"+memCachedClient.get("professionList"));
//
//
////                  Object professionList = professionMapper.selectAll();
////                System.out.println("professionList值为"+professionList);
////
////            JSONObject jsonobject = JSONObject.fromObject(professionList);
////
////            profession = (Profession)JSONObject.toBean(jsonobject,Profession.class);
//
//                professionList = professionMapper.selectAll();
//                jsonArray = JSONArray.fromObject(professionList);
//                boolean list = memCachedClient.set("professionList", jsonArray.toString());
//                log.info("\n"+"新增所有数据缓存:"+list);
//        }
//        }catch (Throwable t){
//           t.printStackTrace();
//      }
//        return profession;
//    }
}

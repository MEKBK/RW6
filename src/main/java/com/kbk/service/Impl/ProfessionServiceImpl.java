package com.kbk.service.Impl;

import com.kbk.dao.ProfessionMapper;
import com.kbk.model.ExcellentStudent;
import com.kbk.model.Profession;
import com.kbk.service.ProfessionService;
import com.kbk.util.MemcachedInterceptor;
import com.kbk.util.RedisUtil;
import com.whalin.MemCached.MemCachedClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @Description
 * @Author 况博凯
 * @Date 2021/02/26 10:14
 * @Version 1.0
 *
 */
@Service
public class ProfessionServiceImpl implements ProfessionService {

//    public static final Logger log = LoggerFactory.getLogger(ProfessionServiceImpl.class);
//
//    @Autowired
//    MemCachedClient memCachedClient;
//
//    @Autowired
//    ProfessionMapper professionMapper;
//
//    @Override
//    public List<Profession> selectAll() throws Exception{
//        List<Profession> professionList = (List<Profession>) memCachedClient.get("professionList");
//        System.out.println("test");
//        System.out.println(professionList);
//        try {
//            if (professionList !=null){
//                log.info("\n"+"从缓存中查询所有");
//            }else {
//                log.info("\n"+"从数据库中查询所有");
//                professionList = professionMapper.selectAll();
//                boolean list = memCachedClient.set("professionList", professionList);
//                log.info("\n"+"新增所有数据缓存:"+list);
//            }
//        }catch (Throwable t){
//            t.printStackTrace();
//        }
//        return professionList;
//    }


//    //使用spring-AOP
      @Autowired
      ProfessionMapper professionMapper;

      @Override
   public List<Profession> selectAll() throws Exception{return professionMapper.selectAll();}

//    @Autowired
//    RedisUtil redisUtil;
//    private static final String KEY = "professionList";
//
//    public static final Logger log = LoggerFactory.getLogger(ExcellentStudentServiceImpl.class);
//
//    @Override
//    public List<Profession> selectAll(){
//        List<Profession> professionList = null;
//        if (redisUtil.hasKey(KEY)) {
//            professionList = (List<Profession>) redisUtil.get(KEY);
//            log.info("\n"+"从Redis缓存中查询所有");
//        } else {
//            log.info("\n"+"从数据库中查询所有");
//            professionList = professionMapper.selectAll();
//            boolean list = redisUtil.set(KEY, professionList);
//            log.info("\n"+"新增所有数据缓存:"+list);
//
//        }
//        return professionList;
//    }
}

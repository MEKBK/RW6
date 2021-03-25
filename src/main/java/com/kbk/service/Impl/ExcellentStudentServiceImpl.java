package com.kbk.service.Impl;

import com.kbk.dao.ExcellentStudentMapper;
import com.kbk.model.ExcellentStudent;
import com.kbk.service.ExcellentStudentService;
import com.kbk.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @Description
 * @Author 况博凯
 * @Date 2021/02/26 10:14
 * @Version 1.0
 *
 */
@Service
public class ExcellentStudentServiceImpl implements ExcellentStudentService {
    @Autowired
    ExcellentStudentMapper excellentStudentMapper;

//    @Override
//    public List<ExcellentStudent> selectAll(){
//        return excellentStudentMapper.selectAll();
//    }


    @Autowired
    RedisUtil redisUtil;
    private static final String KEY = "ExcellentStudentList";

    public static final Logger log = LoggerFactory.getLogger(ExcellentStudentServiceImpl.class);

      @Override
      public List<ExcellentStudent> selectAll(){
          List<ExcellentStudent> excellentStudentList = null;
          if (redisUtil.hasKey(KEY)) {
              excellentStudentList = (List<ExcellentStudent>) redisUtil.get(KEY);
              log.info("\n"+"从Redis缓存中查询所有");
          } else {
              log.info("\n"+"从数据库中查询所有");
              excellentStudentList = excellentStudentMapper.selectAll();
              boolean list = redisUtil.set(KEY, excellentStudentList);
              log.info("\n"+"新增所有数据缓存:"+list);

          }
          return excellentStudentList;
      }


    @Autowired
    private RedisTemplate redisTemplate;

      @Override
      public ExcellentStudent selectByName(String name){
          ValueOperations<String, Object> vos = redisTemplate.opsForValue();

          ExcellentStudent excellentStudent = null;

          if ("".equals(vos.get(name))){

//            (redisTemplate.opsForValue().get(name)==null)
              log.info("\n从缓存返回空值");
              return excellentStudent;
          }

          try {

              if (vos.get(name) != null) {
                  log.info("\n" + "从缓存中查询单条数据");
                  excellentStudent = (ExcellentStudent) vos.get(name);
              } else {
                  log.info("\n" + "从数据库中查询单条数据");
                  excellentStudent = excellentStudentMapper.selectByName(name);
                  if (excellentStudent != null) {
                      vos.set(name, excellentStudent);
                      log.info("\n" + "新增单条缓存数据:" + vos.get(name));
                  } else {
                      vos.set(name,"", 60, TimeUnit.SECONDS);
                      log.info("\n" + "将空值存到缓存");
                  }
              }
          } catch (Throwable t) {
              t.printStackTrace();
          }
          return excellentStudent;
      }
}

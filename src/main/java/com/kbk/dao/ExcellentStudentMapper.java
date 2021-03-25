package com.kbk.dao;

import com.kbk.model.ExcellentStudent;
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
public interface ExcellentStudentMapper {

    /**
     * 查找Profession列表
     * @param
     * @return Banner
     */
    List<ExcellentStudent> selectAll();


    /**
     * 根据姓名查询
     * @param
     * @return
     */
    ExcellentStudent selectByName(String name);
}
package com.kbk.controller;


import com.kbk.Rest.Restful;
import com.kbk.Rest.TimeAspectJ;
import com.kbk.model.ExcellentStudent;
import com.kbk.model.Profession;
import com.kbk.service.Impl.ExcellentStudentServiceImpl;
import com.kbk.service.Impl.ProfessionServiceImpl;
import com.kbk.util.WebUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 *
 * @Description
 * @Author 况博凯
 * @Date 2021/03/19 10:14
 * @Version 2.0
 *
 */

@Controller
public class StudentController {

    private static Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    ExcellentStudentServiceImpl excellentStudentService;
    @Autowired
    ProfessionServiceImpl professionService;

    @RequestMapping(value = "/findPage", method = RequestMethod.GET)
    public String login(){
        return "findPage";
    }

    @RequestMapping(value = "/findPage", method = RequestMethod.POST)
    public String selectByNameAndExcellentStudent(HttpServletRequest request, Model model) {
        logger.info("GET /findPage ");
        String name = request.getParameter("name");
        System.out.println("传入的值name:"+name);
        model.addAttribute("excellentStudent", excellentStudentService.selectByName(name));
        return "findNameResult";
    }

    @RequestMapping(value = "/excellentStudent", method = RequestMethod.GET)
    public String excellentStudent(Map<String,Object> map){
        List<ExcellentStudent> studentList = excellentStudentService.selectAll();
        map.put("Exs",studentList);
        return "excellentStudent";
    }

    @RequestMapping(value = "/excellentStudentJson", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> excellentStudentJson(){
        List<ExcellentStudent> studentList = excellentStudentService.selectAll();
        if (null == studentList) {
            return Restful.set(400, "查找优秀学员失败" );
        } else {
            return Restful.set(200, "查找优秀学员成功", studentList);
        }
    }




    @RequestMapping(value = "/u/profession", method = RequestMethod.GET)
    public String profession(Map<String,Object> map, HttpServletRequest request) throws Exception {
      //  String ip = WebUtil.getIpAddress(request);

        List<Profession> professionList = professionService.selectAll();
        map.put("pro",professionList);
        return "profession";
    }

    @RequestMapping(value = "/u/professionJson", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> professionJson() throws Exception {

        List<Profession> professionList = professionService.selectAll();

        if (null == professionList) {
            return Restful.set(400, "查找职业失败" );
        } else {
            return Restful.set(200, "查找职业成功", professionList);
        }

    }
}

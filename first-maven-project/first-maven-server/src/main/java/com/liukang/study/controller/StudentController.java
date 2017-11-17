package com.liukang.study.controller;

import com.liukang.study.model.Student;
import com.liukang.study.server.StudentService;
import com.liukang.study.server.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RequestMapping("maven/student")
public class StudentController {


    @RequestMapping("/action")
    public ModelAndView action(){
        ModelAndView mav = new ModelAndView();
        Student student = new Student();
        student.setName("刘康");
        student.setAge(11);
        student.setTag("我喜欢Java，我想学会髙新技能");
        student.setBirthday(new Date());

        StudentService server = new StudentServiceImpl();
        server.saySomething(student);
        return mav;
    }

    public static void main(String[] args){

        Student student = new Student();
        student.setName("刘康");
        student.setAge(11);
        student.setTag("我喜欢Java，我想学会髙新技能");
        student.setBirthday(new Date());

        StudentService server = new StudentServiceImpl();
        server.saySomething(student);
    }
}

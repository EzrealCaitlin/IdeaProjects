package com.liukang.study.controller;

import com.liukang.study.model.Student;
import com.liukang.study.server.StudentService;
import com.liukang.study.server.impl.StudentServiceImpl;

import java.util.Date;

public class StudentController {
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

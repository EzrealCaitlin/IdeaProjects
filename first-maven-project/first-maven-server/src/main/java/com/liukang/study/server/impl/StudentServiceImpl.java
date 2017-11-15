package com.liukang.study.server.impl;

import com.liukang.study.model.Student;
import com.liukang.study.server.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void saySomething(Student student){
        System.out.println(student.getName()+"想说:'"+student.getTag()+"'");
    }
}


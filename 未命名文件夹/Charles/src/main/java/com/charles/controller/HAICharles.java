package com.charles.controller;


import com.charles.dao.Student;
import com.charles.dao.TestTask;
import com.charles.entity.User;
import com.configuration.MyAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

@RestController
public class HAICharles {

    @Autowired
    private Student student;

    @GetMapping("/charles")
    public  String Cahrles() {
        return "Hello Charles";
    }


    @Cacheable(key = "#p0")
    @GetMapping("/charles2")
    public  void charles2() throws ExecutionException, InterruptedException {
//        Student student = new Student();
//        TestTask testTask = new TestTask();
        String reason = student.getName();
        System.out.println(reason);

//        TestTask testTask = new TestTask("",1);
//        ForkJoinPool pool = new ForkJoinPool();
//        ForkJoinTask<String> submit = pool.submit(testTask);
//        System.out.println("-=-=-=-=-=-=-=-======---");
//        System.out.println(submit.get());
//        pool.shutdown();
    }

    @GetMapping("/charles3")
    public  String Cahrles3() {
        MyAutoConfiguration myAutoConfiguration = new MyAutoConfiguration();
        User user = myAutoConfiguration.getUser();
        return user.getName()+"性别 " + user.getSex();
    }


}

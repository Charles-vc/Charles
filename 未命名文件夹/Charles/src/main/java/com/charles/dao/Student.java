package com.charles.dao;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class Student implements Serializable {

    private String name;

    private Integer num;


    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}

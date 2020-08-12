package com.charles.dao;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class TestTask extends RecursiveTask<String> {

    private String reason;
    private Integer num;

    public TestTask() {

    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public TestTask(String reason, Integer num) {
        this.reason = reason;
        this.num = num;
    }

    @Override
    protected String compute() {
        if(num < 3){
            AtomicInteger atomicInteger = new AtomicInteger(0);
            Integer integer = new Integer(0);
            System.out.println("当前不变数为" + atomicInteger.getAndIncrement());
            System.out.println("当前变数为-=-=-=" + num);
            num++;
            TestTask left = new TestTask("111bainshu",num);
            TestTask right = new TestTask("222bainshu", num);
            left.fork();
            right.fork();

            return left.join() + right.join();
        }else
        {
            return "dsaopopopop";
        }

    }

}

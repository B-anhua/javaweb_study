package com.powernode.spring6.bean;

/**
 * @PROJECT_NAME: spring6
 * @className: MathBean
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-06 00:04
 **/

public class MathBean {
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MathBean{" +
                "result='" + result + '\'' +
                '}';
    }
}

package com.powernode.spring6.bean;

/**
 * @PROJECT_NAME: spring6
 * @className: cat
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-05 15:00
 **/

public class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

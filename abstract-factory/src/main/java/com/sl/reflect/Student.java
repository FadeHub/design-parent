package com.sl.reflect;

/**
 * @author shuliangzhao
 * @Title: Student
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/15 23:08
 */
public class Student {

    private String name;

    private Integer age;

    public Student() {

    }

    public Student(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @AgeValidator(min = 4,max = 20)
    public void setAge(Integer age) {
        this.age = age;
    }
}

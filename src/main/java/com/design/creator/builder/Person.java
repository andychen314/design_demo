package com.design.creator.builder;

import java.util.Date;

/**
 * @author Andy
 * @date 18/6/6
 */
public class Person {

    private String name;
    /**
     * 1:male 2:female
     */
    private int sex;

    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

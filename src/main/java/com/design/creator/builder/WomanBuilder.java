package com.design.creator.builder;

import java.util.Date;

/**
 * @author Andy
 * @date 18/6/6
 */
public class WomanBuilder implements PersonBuilder {

    private Person woman;

    @Override
    public void builderPerson(String name, Date birthday) {
        woman=new Person();
        woman.setName(name);
        woman.setBirthday(birthday);
        woman.setSex(2);
    }
}

package com.design.creator.builder;

import java.util.Date;

/**
 * @author Andy
 * @date 18/6/6
 */
public class ManBuilder implements PersonBuilder {

    private Person man;

    @Override
    public void builderPerson(String name, Date birthday) {
        man=new Person();
        man.setName(name);
        man.setBirthday(birthday);
        man.setSex(1);
    }
}

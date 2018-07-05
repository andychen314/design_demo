package com.design.behavior.template;

/**
 * @author Andy
 * @date 18/6/11
 */
public class Client {

    public static void main(String[] args) {
        Student student = new Student();
        student.prepareGotoSchool();

        Teacher teacher = new Teacher();
        teacher.prepareGotoSchool();
    }

}

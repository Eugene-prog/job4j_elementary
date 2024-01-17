package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Ivanov Pavel Ivanovich");
        student1.setGroup("IT-24");
        student1.setAdmissionDate(new Date());
        System.out.println(student1.getFullName());
        System.out.println(student1.getGroup());
        System.out.println(student1.getAdmissionDate());
    }
}

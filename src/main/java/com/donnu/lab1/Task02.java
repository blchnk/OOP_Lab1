package com.donnu.lab1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task02 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = context.getBean("myEmployee", Employee.class);
        employee.callYourPet();
        employee.openTheCar();
        System.out.println(employee.getName());
        System.out.println(employee.getAge());

        context.close();
    }
}

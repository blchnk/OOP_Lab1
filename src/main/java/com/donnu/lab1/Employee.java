package com.donnu.lab1;

public class Employee {
    private ICar car;
    private IPet pet;
    private String name;
    private int age;

    public void setCar(ICar car) {
        this.car = car;
    }

    public void setPet(IPet pet){
        this.pet = pet;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() { return name; }

    public int getAge(){
        return age;
    }

    public Employee(){
    }

    public void openTheCar(){
        System.out.println("Opened");
        car.explosion();
    }

    public void callYourPet(){
        System.out.println("Hey!");
        pet.say();
    }
}

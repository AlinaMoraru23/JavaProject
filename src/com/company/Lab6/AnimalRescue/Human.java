package com.company.Lab6.AnimalRescue;

public abstract class Human {

    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public abstract void intention();


}

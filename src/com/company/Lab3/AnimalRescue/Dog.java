package com.company.Lab3.AnimalRescue;

public class Dog {
    //atributele clasei
    private String breed;
    private int age;
    private float heightM;
    private float weightKg;
    private String name;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeightM(float heightM) {
        this.heightM = heightM;
    }

    public float getHeightM() {
        return heightM;
    }

    public void setWeightKg(float weightKg) {
        this.weightKg = weightKg;
    }

    public float getWeightKg() {
        return weightKg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    //comportamentele clasei
    public void eat(){
        System.out.println("Eating Royal Canin");
    }
    public void drink(){
        System.out.println("Drinking water");
    }
    public void play(){
        System.out.println("Playing with toys");
    }




}

package com.company.Lab6.AnimalRescue;

public abstract class Animal {
    //atributele clasei
    private String nameAnimal;
    private float ageAnimal;
    private int health;
    private int hunger;
    private int mood;
    private String favouriteFood;
    private String favouriteActivity;

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setAgeAnimal(float ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    public float getAgeAnimal() {
        return ageAnimal;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getMood() {
        return mood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }

//comportamentele clasei

    public abstract void eat();

    public abstract void sound();

    public abstract void play();









}

package com.company.Lab5.AnimalRescue;

import com.company.Lab4.AnimalRescue.*;

public class AppMain {

    public static void main(String[] args) {
//class activity

        com.company.Lab5.AnimalRescue.Activity activity1 = new com.company.Lab5.AnimalRescue.Activity();
        activity1.setNameAct("Sleep");

        System.out.println(activity1.getNameAct());

        com.company.Lab5.AnimalRescue.Activity activity2 = new Activity();
        activity2.setNameAct("Play");

        System.out.println(activity2.getNameAct());

//class Animal

        Animal animal1 = new Animal();
        animal1.setNameAnimal("Jessy");
        animal1.setAgeAnimal(7.5f);
        animal1.setHealth(9);
        animal1.setHunger(2);
        animal1.setMood(7);
        animal1.setFavouriteFood("Royal Canin");
        animal1.setFavouriteActivity("Sleep");

        System.out.println(animal1.getNameAnimal());
        System.out.println(animal1.getAgeAnimal());
        System.out.println(animal1.getHealth());
        System.out.println(animal1.getHunger());
        System.out.println(animal1.getMood());
        System.out.println(animal1.getFavouriteFood());
        System.out.println(animal1.getFavouriteActivity());


//class Cat - done

        Cat cat1 = new Cat();

        cat1.setNameAnimal("Thomas");
        cat1.setAgeAnimal(3.7f);
        cat1.setHealth(6);
        cat1.setHunger(2);
        cat1.setMood(5);
        cat1.setFavouriteActivity("Sleep");
        cat1.setFavouriteFood("Purina");

        System.out.println(cat1.getNameAnimal());
        System.out.println(cat1.getAgeAnimal());
        System.out.println(cat1.getHealth());
        System.out.println(cat1.getHunger());
        System.out.println(cat1.getMood());
        System.out.println(cat1.getFavouriteActivity());
        System.out.println(cat1.getFavouriteFood());

//class Doctor

        com.company.Lab5.AnimalRescue.Doctor doctor1 = new Doctor();

        doctor1.setNameDoc("Denisa Moldovan");
        doctor1.setDomain("Sugery");

        System.out.println("Doctor " + doctor1.getNameDoc() + ", " + "specialized in " + doctor1.getDomain());

//class Dog - done

        Dog dog1 = new Dog();

        dog1.setNameAnimal("Lexi");
        dog1.setAgeAnimal(7);
        dog1.setHealth(9);
        dog1.setHunger(8);
        dog1.setMood(5);
        dog1.setFavouriteActivity("Run");
        dog1.setFavouriteFood("Royal Canin");

        System.out.println(dog1.getNameAnimal());
        System.out.println(dog1.getAgeAnimal());
        System.out.println(dog1.getHealth());
        System.out.println(dog1.getHunger());
        System.out.println(dog1.getMood());
        System.out.println(dog1.getFavouriteActivity());
        System.out.println(dog1.getFavouriteFood());

        dog1.drink();
        dog1.eat();
        dog1.play();

//class Food

        Food food1 = new Food();

        food1.setInStock("Yes");
        food1.setNameFood("Purina");
        food1.setPrice(25.9f);
        food1.setQuantity(35);

        System.out.println(food1.getInStock());
        System.out.println(food1.getNameFood());
        System.out.println(food1.getPrice());
        System.out.println(food1.getQuantity());

//class Rescuer

        Rescuer rescuer1 = new Rescuer();

        rescuer1.setName("Adela Morar");
        rescuer1.setMoney(1000);

        System.out.println("Rescuer name: " + rescuer1.getName());
        System.out.println("Rescuer budget: " + rescuer1.getMoney());

    }

}

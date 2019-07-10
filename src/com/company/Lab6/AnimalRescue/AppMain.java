package com.company.Lab6.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
//class activity

        Activity activity1 = new Activity();
        activity1.setNameAct("Sleep");

        System.out.println(activity1.getNameAct());

        Activity activity2 = new Activity();
        activity2.setNameAct("Play");

        System.out.println(activity2.getNameAct());


//class Cat

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

        cat1.eat();
        cat1.sound();
        cat1.play();

//class Doctor

        Doctor doctor1 = new Doctor();

        doctor1.setName("Denisa Moldovan");
        doctor1.setDomain("Sugery");
        doctor1.setAge(47);
        doctor1.setGender("Female");

        System.out.println(doctor1.getName());
        System.out.println(doctor1.getDomain());
        System.out.println(doctor1.getAge());
        System.out.println(doctor1.getGender());

        doctor1.intention();


//class Dog

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


        dog1.eat();
        dog1.sound();
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

        rescuer1.intention();

    }

}

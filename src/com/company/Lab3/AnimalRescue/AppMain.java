package com.company.Lab3.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
//class activity

        Activity activity1 = new Activity();
        activity1.setNameAct("Sleep");

        System.out.println(activity1.getNameAct());

        Activity activity2 = new Activity();
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


//class Cat

        Cat cat1 = new Cat();

        cat1.setBreed("Hymalayan");
        cat1.setAge(3);
        cat1.setHeightM(0.3f);
        cat1.setWeightKg(5.1f);
        cat1.setName("Thomas");

        System.out.println(cat1.getBreed());
        System.out.println(cat1.getAge());
        System.out.println(cat1.getHeightM());
        System.out.println(cat1.getWeightKg());
        System.out.println(cat1.getName());

//class Doctor

        Doctor doctor1 = new Doctor();

        doctor1.setNameDoc("Denisa Moldovan");
        doctor1.setDomain("Sugery");

        System.out.println("Doctor " + doctor1.getNameDoc() + ", " + "specialized in " + doctor1.getDomain());

//class Dog

        Dog dog1 = new Dog();

        dog1.setAge(3);
        dog1.setBreed("Beagle");
        dog1.setHeightM(0.5f);
        dog1.setName("Lexi");
        dog1.setWeightKg(7);

        System.out.println(dog1.getAge());
        System.out.println(dog1.getBreed());
        System.out.println(dog1.getHeightM());
        System.out.println(dog1.getName());
        System.out.println(dog1.getHeightM());

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

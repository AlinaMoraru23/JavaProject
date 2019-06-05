package com.company.lab2.AnimalRescue;

import com.sun.tools.internal.xjc.model.CAttributePropertyInfo;

import javax.print.Doc;
import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
      //la curs
        Dog Jessy = new Dog();

        System.out.println(Jessy.name);
        System.out.println(Jessy.breed);
        System.out.println(Jessy.age);
        System.out.println(Jessy.heightM);
        System.out.println(Jessy.weight);

        Jessy.eat();
        Jessy.drink();
        Jessy.play();
        System.out.println();


        Cat Tom = new Cat();

        System.out.println(Tom.name);
        System.out.println(Tom.breed);
        System.out.println(Tom.age);
        System.out.println(Tom.heightM);
        System.out.println(Tom.weight);

        Tom.eat();
        Tom.drink();
        Tom.play();


    //tema
        Animal Carla = new Animal();

        System.out.println(Carla.nameAnimal);
        System.out.println(Carla.ageAnimal);
        System.out.println(Carla.health);
        System.out.println(Carla.hunger);
        System.out.println(Carla.mood);
        System.out.println(Carla.favouriteFood);
        System.out.println(Carla.favouriteActivity);

        Rescuer Diana = new Rescuer();

        System.out.println(Diana.name);
        System.out.println(Diana.money);

        Food Acana = new Food();

        System.out.println(Acana.nameFood);
        System.out.println(Acana.price);
        System.out.println(Acana.quatity);
        System.out.println(Acana.inStock);

        Activity Play = new Activity();

        System.out.println(Play.nameAct);

        Doctor Oana = new Doctor();

        System.out.println(Oana.nameDoc);
        System.out.println(Oana.domain);















    }


}

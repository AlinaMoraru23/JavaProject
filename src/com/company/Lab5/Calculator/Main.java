package com.company.Lab5.Calculator;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


//Tema
        System.out.println("\nTema\n");

//Java Arrays

//1.In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele conform principiului polimorfismului.
// Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa.

        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.sum(20.6f, 17.9f, 45.2f));
        System.out.println(myCalculator.sum(12, 30));
        System.out.println(myCalculator.difference(500, 267));
        System.out.println(myCalculator.difference(367.7f, 45.9f));
        System.out.println(myCalculator.multiply(12, 8));
        System.out.println(myCalculator.multiply(45f, 27.4f, 76.2f));
        System.out.println(myCalculator.divide(28, 4));
        System.out.println(myCalculator.divide(457f, 5.678f));
        System.out.println(myCalculator.average(38.5f, 567.2f, 75.9f, 567));
        System.out.println(myCalculator.average(578.2f, 865, 837.4f));

//ex 2

        LogicalOp operations = new LogicalOp();


        int[] myArray2 = operations.myArrayToHundred();
        for (int i = 0; i < myArray2.length; i++) {
            System.out.println(myArray2[i]);
        }

//ex 3

        int[] myArray3 = operations.myEvenArrayToHundred();
        for (int i = 0; i < myArray3.length; i++) {
            System.out.println(myArray3[i]);
        }

//ex 4


        int[] myArray4 = {65, 90, 63, 58};
        System.out.println(operations.myArrayAverage(myArray4));

//ex 5

        String[] myCities = {"Cluj", "Brasov", "Sibiu", "Sighisoara"};

        System.out.println(operations.myArrayCheck(myCities, "Cluj"));


//ex 6
//obs: daca valoarea nu se afla in array, metoda va returna -1 (o valoare care nu poate exista ca si index)

        int[] myNumbers = {39, 67, 30, 56};

        System.out.println(operations.myNumberCheck(myNumbers,6));

    }
}

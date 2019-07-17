package com.company.Lab7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Read {

//1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.

    public int getInt() {

        boolean repeat;
        int x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }


//2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode, care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)


    public float getFloat() {

        boolean repeat;
        float x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }

    public double getDouble() {

        boolean repeat;
        double x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }

    public long getLong() {

        boolean repeat;
        long x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextLong();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }

    public byte getbyte() {

        boolean repeat;
        byte x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextByte();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }

//3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura. Metoda sa primeasca
// ca si parametru un numar, care reprezinta cate pozitii are.

    public int[] getArrayA(int length) {

        System.out.print("Enter array elements");

        int[] myArray = new int[length];
        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = getInt();

        }
        return myArray;

    }

//metoda cu parametru primit de la tastatura

    public int[] getArrayB() {

        System.out.print("Enter the array length");
        int number = getInt();

        System.out.print("Enter array elements");

        int[] myArray = new int[number];
        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = getInt();

        }
        return myArray;

    }

//4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura. Metoda nu v-a primii parametru lungimea.
// In rezolvarea ei trebuie folosit try-catch. (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar,
// sa se intrerupa citirea)


    public List<Integer> getList() {
        List<Integer> myList = new ArrayList<>();

        boolean repeat;

        do {
            try {
                Scanner scan = new Scanner(System.in);
                int x = scan.nextInt();
                myList.add(x);
                repeat = true;
            } catch (InputMismatchException error) {
                repeat = false;
            }
        } while (repeat);

        return myList;

    }

}


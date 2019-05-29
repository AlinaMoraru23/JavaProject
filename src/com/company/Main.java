package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //Printati "Hello" in consola, iar pe rand nou, printati numele vostru.//

        System.out.println("Hello,");
        System.out.println();
        System.out.println("Alina Moraru");
        System.out.println();

        //Printati rezultatul sumei a doua numere(orice numere)
        int sumResult = 10+12;
        System.out.println(sumResult);
        System.out.println();

        //Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.//

        double no1 = 25;
        double divideResult1 = no1/2;
        System.out.println(divideResult1);
        System.out.println();

        double divideResult2 = 10.0/3;
        System.out.println(divideResult2);
        System.out.println();


        //Printati rezultatul urmatoarelor operatiuni//
        //-5 + 8 * 6//

        System.out.println(-5+8*6);
        System.out.println();

        //(55+9) % 9//

        System.out.println((55+9)%9);
        System.out.println();

        //20 + -3*5 / 8 //

        double rez1 =-3*5;

        System.out.println(20 + (rez1)/8);
        System.out.println();

        //5 + 15 / 3 * 2 - 8 % 3//

        System.out.println(5+((15/3)*2)-(8%3));

    }
}

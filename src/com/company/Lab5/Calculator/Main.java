package com.company.Lab5.Calculator;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        LogicalOp operations = new LogicalOp();

        operations.myArrayToHundred();

        int[] myArray = operations.myArrayToHundred();
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }


        Calculator calc = new Calculator();
        System.out.println(calc.sum(3.7f,5.9f,2.6f));
    }
}

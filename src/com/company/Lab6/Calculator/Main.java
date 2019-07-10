package com.company.Lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LogicalOp operations = new LogicalOp();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(44);
        integerList.add(67);
        integerList.add(90);
        integerList.add(137);
        integerList.add(100);

        List<String> stringList = new ArrayList<>();
        stringList.add("Cluj");
        stringList.add("Bucuresti");
        stringList.add("Timisoara");
        stringList.add("Iasi");
        stringList.add("Constanta");
        stringList.add("Brasov");


//ex 1
        operations.printMyList(integerList);

//ex 2
        operations.addNumberToList(integerList, 23);
        System.out.println(integerList);

//ex 3
        operations.printFromInput(integerList, 90);

//ex 4
        operations.printMyListBackwards(integerList);

//ex 5

        operations.addStringToListAtIndex(stringList, 2, "Sibiu");
        System.out.println(stringList);

//ex6
        operations.addStringOnFirstPosition(stringList, "Oradea");
        System.out.println(stringList);

//ex7

        operations.displayIndexAndListElement(integerList);

//ex8
        System.out.println("The max number is: " + operations.returnBiggestNumber(integerList));


//Tema optionala

//ex 1

        operations.changePosition(stringList);
        System.out.println(stringList);

//ex 2
        System.out.println(operations.evenNumbersList(integerList));


//ex 3

    }
}
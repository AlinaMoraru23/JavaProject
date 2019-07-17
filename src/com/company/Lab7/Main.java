package com.company.Lab7;

public class Main {
    public static void main(String[] args) {

        Read read = new Read();
        LogicalOp operations = new LogicalOp();
//ex1
        System.out.println("Give number");
        System.out.println("the number is " + read.getInt());


//ex3 A
        int[] myArray1 = read.getArrayA(4);
        for(int i =0; i<myArray1.length; i++){
            System.out.println(myArray1[i]);

        }
//ex3 B
        int[] myArray2 = read.getArrayB();
        for(int i =0; i<myArray2.length; i++){
            System.out.println(myArray2[i]);
        }
//ex 4
        System.out.println("Enter array numbers");
        System.out.println(read.getList());

//ex 5

        operations.displayNumber(myArray1,2);

    }


}

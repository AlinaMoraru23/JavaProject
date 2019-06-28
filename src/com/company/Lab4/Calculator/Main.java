package com.company.Lab4.Calculator;

public class Main {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();

        op.printBackwards(10, 5);
        op.printSumAndAverage();
//WHILE
//ex1
        op.printTo100(90);

//ex2
        op.printBackwardsTo100(-95);

//ex3
        op.printFromXToY(2,7);

//ex4
        op.printFromSmallestToLargest(14,10);

//ex5
        op.printEvenNumbers();

//ex6
        op.printOddNumbers();




//FOR


//ex1
        op.printTo100F(90);

//ex2
        op.printBackwardsTo100F(0);

//ex3
        op.printFromXToYF(60,70);

//ex4
        op.printFromSmallestToLargestF(30,20);

    }
}

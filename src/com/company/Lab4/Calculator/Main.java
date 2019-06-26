package com.company.Lab4.Calculator;

public class Main {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();

        op.printBackwards(10, 5);
        op.printSumAndAverage();
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
    }
}

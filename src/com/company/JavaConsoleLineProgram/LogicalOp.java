package com.company.JavaConsoleLineProgram;


public class LogicalOp {

// Print from number to 100

    void printTo100(int number) {
        int i = number;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
// Print backwards from number to -100


    void printBackwardsTo100(int number) {
        int i = number;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

// print from first to second

    void printFromXToY(int no1, int no2) {
        int i = no1;
        while (i <= no2) {
            System.out.println(i);
            i++;
        }
    }

// print from smallest to lagest

    void printFromSmallestToLargest(int no1, int no2) {

        int small;
        int large;

        if (no1 < no2) {

            small = no1;
            large = no2;
        } else {
            small = no2;
            large = no1;
        }

        int i = small;
        while (i <= large) {
            System.out.println(i);
            i++;

        }
    }

// Print all even numbers from 1 to 100

    void printEvenNumbers() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
// Print  all odd numbers from 1 to 100

    void printOddNumbers() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

}

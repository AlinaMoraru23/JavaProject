package com.company.Lab4.Calculator;


public class LogicalOp {

    //ex 3 - biggest number
    public int checkBiggerNumber(int firstNo, int secondNo) {

        if (firstNo > secondNo) {
            return firstNo;
        } else {
            return secondNo;
        }
    }

//ex 4 - compare String

    public String compareText(String text1) {
        String first = text1;
        String second = "FastTrackIT";

        if (first.equals(second)) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }

    }
// ex 5 - compare string + int

    public String compare5(String text1, int no1) {
        String first = text1;
        String second = "FastTrackIT";

        if (first.equals(second) && no1 <= 3) {
            String response1 = first + no1;
            return response1;

            //mergea si varianta asta dar erau mai multe linii de cod :)
            //if (first.equals(second)) {
            //if (no1<=3){

        } else if (!first.equals(second) && no1 >= 4) {
            String response2 = no1 + first;
            return response2;
        }
        return "cele 2 conditii nu au fost indeplinite simultan";

    }
// ex 6

    public String compare6(int no1) {
        if (no1 > 8 || no1 == 6) {
            return "The amount of snow this winter was(cm): " + no1;

        } else {
            return "The forecast snow is(cm): " + no1;
        }


    }

// ex 7

    public String compare7(int no1) {
        if (no1 > 3 && no1 != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (no1 == 4) {
            return "The number is equal to 4";
        } else {
            return "The number is lower than 3";
        }

    }

    // ex 8
    public String ex8(int no1) {
        int number = no1;
        String returnNumber;
        switch (number) {
            case 1:
                returnNumber = "the number is 1";
                break;
            case 3:
                returnNumber = "the number is 3";
                break;
            case 5:
                returnNumber = "the number is 5";
                break;
            default:
                returnNumber = "the number is not 1, 3 or 5";

        }
        return returnNumber;
    }

// ex 9

    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
//ex 10

    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

//ex 11


    public int biggestNumber(int no1, int no2, int no3) {
        if (no1 >= no2 && no1 >= no3) {
            return no1;
        } else if (no2 >= no1 && no2 >= no3) {
            return no2;
        } else {
            return no3;
        }
    }


//Laborator 4

    public void printBackwards(int no1, int no2) {
        for (int i = no1; i >= no2; i--) {
            System.out.println(i);

        }

    }


    public void printSumAndAverage() {
        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println(sum);
        System.out.println("Average is :" + (sum / 100f));


    }


//Tema  - while


//1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
// Metoda sa verifice numarul primit si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.


    public void printTo100(int number) {
        int i = number;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
//2. Creati o metoda in clasa LogicalOp, care primeste un numar ca si parametru.
// Metoda sa verifice numarul primit si sa afiseze in consola o numaratoare (inversa) pana la -100, pornind de la numarul primit ca si parametru.


    public void printBackwardsTo100(int number) {
        int i = number;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

//3. Creati o metoda in clasa LogicalOp, care primeste doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea.

    public void printFromXToY(int no1, int no2) {
        int i = no1;
        while (i <= no2) {
            System.out.println(i);
            i++;
        }
    }

//4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.

    public void printFromSmallestToLargest(int no1, int no2) {

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

//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void printEvenNumbers() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
//6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void printOddNumbers() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }


//Tema - For

//1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numrul primit,
// si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.

    public void printTo100F (int number){
        for (int i = number; i<=100;i++ ){
            System.out.println(i);
        }
    }
//2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numrul primit,
// si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.

    public void printBackwardsTo100F (int number){
        for (int i = number; i>=-100; i--){
            System.out.println(i);
        }
    }

//3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze o numaratoare
// intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru
// iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.


    public  void printFromXToYF (int no1, int no2){
        for (int i = no1; i<=no2; i++){
            System.out.println(i);
        }
    }

//4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele doua
// numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar
// int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).


    public void printFromSmallestToLargestF(int no1, int no2) {
        int small;
        int large;

        if (no1 < no2) {

            small = no1;
            large = no2;
        } else {
            small = no2;
            large = no1;
        }

        for (int i = small; i <= large; i++) {
            System.out.println(i);
        }
    }

}
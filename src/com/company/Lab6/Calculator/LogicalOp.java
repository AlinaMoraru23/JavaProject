package com.company.Lab6.Calculator;


import java.util.List;
import java.util.ArrayList;

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


//Tema

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


//Tema lab 5


//2.In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
// Sa se afiseze progresul in consola pe tot parcursul.

    public int[] myArrayToHundred() {
        int[] myArray2 = new int[100];

        for (int i = 1; i <= myArray2.length; i++) {
            myArray2[i - 1] = i;
        }
        return myArray2;
    }

//3.Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate
// valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza. Atentie, metoda returneaza
// un array, deci acesta va trebui surprins si afisat folosind o bucla.

    public int[] myEvenArrayToHundred() {
        int[] myArray3 = new int[50];

        for (int i = 1; i <= myArray3.length; i++) {
            myArray3[i - 1] = i * 2;
        }
        return myArray3;
    }

//4.Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
// Metoda sa calculeze si sa returneze media numerelor din array.

    public float myArrayAverage(int[] myArray4) {

        float sum = 0;
        for (int i = 0; i < myArray4.length; i++) {
            sum += myArray4[i];
        }
        return sum / myArray4.length;
    }

//5.Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un
// parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit,
// iar daca da sa returneze true iar daca nu, sa returneze false.


    public boolean myArrayCheck(String[] myString, String myValue) {
        for (String element : myString) {
            if (element.equals(myValue)) {
                return true;
            }
        }
        return false;

    }

//6.Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru
// de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze
// pozitia pe care se afla numaru


    public int myNumberCheck(int[] myArrayNumbers, int myNumber) {

        int position = -1;
        for (int i = 0; i < myArrayNumbers.length; i++) {
            if (myArrayNumbers[i] == myNumber) {
                position = i;
                break;
            }
        }
        return position;
    }

//7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
//----------
//----------
//----------
//----------
//----------
//----------
//----------
//----------
//----------
//----------
//----------



//8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
//    Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.




//9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.


//10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
////    Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.








//Lab 6

    public List<Integer> getListHundred(){
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            myList.add(i);
        }

        return myList;
    }


//Tema Lab 6


//1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.


    public void printMyList(List<Integer> myList){
        for (int i = 0; i<myList.size();i++){
            System.out.println(myList.get(i));

        }

    }

//2. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
// Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addNumberToList(List<Integer> myList ,int number){
        myList.add(number);

    }

//3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
// Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit
// ca si parametru.


    public void printFromInput(List<Integer> myList, int input){
        if (myList.contains(input)) {
            for (int i = myList.indexOf(input); i < myList.size(); i++) {
                System.out.println(myList.get(i));
            }

        }else{
            System.out.println("The list doesn't contain the given number");
        }
    }

//4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).

    public void printMyListBackwards(List<Integer> myList){
        for (int i = myList.size()-1; i>=0; i--){
            System.out.println(myList.get(i));
        }
    }

//5. Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String. Metoda sa adauge
// parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void addStringToListAtIndex(List<String> myList, int index, String input){
        myList.add(index,input);
    }

//6. Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima
// pozitie din lista.

    public void addStringOnFirstPosition (List<String> myList, String input){
        myList.add(0,input);
    }

//7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void displayIndexAndListElement (List<Integer> myList){
        for (int i=0; i<myList.size(); i++){
            System.out.println("Pe pozitia " + i + " valoarea este " + myList.get(i));
        }
    }

//8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public int returnBiggestNumber (List<Integer> myList){
        Integer max = 0;
        for (Integer i: myList){
            if (max<i){
                max = i;
            }
        }
        return max;

    }

}
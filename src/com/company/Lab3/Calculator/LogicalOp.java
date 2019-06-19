package com.company.Lab3.Calculator;

import javax.lang.model.element.NestingKind;
import javax.sound.midi.Soundbank;



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

    public boolean isEligibleToVote (int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

//ex 11


    public int biggestNumber (int no1, int no2, int no3) {
        if (no1>=no2 && no1>=no3) {
            return no1;
        }else if (no2>=no1 && no2>=no3) {
            return no2;
        }else{
            return no3;
        }
    }


}



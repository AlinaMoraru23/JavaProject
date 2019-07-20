package com.company.JavaConsoleLineProgram;

import java.util.List;

class StringListOp {


    //display list

    void printMyList(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));

        }
    }

    //display list backwards

    void printMyListBackwards(List<String> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
    }

    //display index and element
    void displayIndexAndListElement(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(i + " " + myList.get(i));
        }
    }

    //add String to 1st position
    void addStringOnFirstPosition(List<String> myList, String input) {
        myList.add(0, input);
    }

    //add String to a given position
    void addStringToListAtIndex(List<String> myList, int index, String input) {
        myList.add(index, input);
    }

}

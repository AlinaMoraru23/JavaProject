package com.company.JavaConsoleLineProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Run {

    private Scanner scan = new Scanner(System.in);
    private Read read = new Read();
    private Login login = new Login();
    private Calculator calc = new Calculator();
    private LogicalOp logic = new LogicalOp();
    private StringListOp stringListOp = new StringListOp();
    private Display display = new Display();

    List<String> stringList = new ArrayList<>();

    private void printLoginMenu() {
        System.out.println("Hello!\n" +
                "1. Login\n" +
                "2. Register\n");
    }

    private void selectItemFromLoginMenu() {
        System.out.print("Please select menu number: \n ");

        boolean repeat = false;
        do {
            int numberFromUser = read.getInt();
            switch (numberFromUser) {
                case 1:
                    login.userLogin();
                    break;

                case 2:
                    login.userRegister();
                    break;

                default:
                    System.out.println("Option not available. Please try again");
                    repeat = true;
            }
        } while (repeat);
    }

    private void printMenu() {

        System.out.println("1. Mathematical Operations \n" +
                "2. Conversions \n" +
                "3. Speed calculation\n" +
                "4. Display numbers\n" +
                "5. City list\n" +
                "6. Happy face\n" +
                "0. Quit program ");
    }


    private void printSubMenu1() {

        System.out.println("1. Sum \n" +
                "2. Difference \n" +
                "3. Multiply \n" +
                "4. Divide \n" +
                "5. Average \n" +
                "0. Return to Main Menu ");
    }

    private void printSubMenu2() {
        System.out.println("1. Degrees Fahrenheit to Celsius \n" +
                "2. Meters to Inches \n" +
                "0. Return to Main Menu \n");
    }

    private void printSubMenu3() {
        System.out.println("1. Meters/Hour \n" +
                "2. Kilometers/Hour \n" +
                "3. Miles/Hour \n" +
                "0. Return to Main Menu");
    }

    private void printSubMenu4() {
        System.out.println("1. Print to 100 from a given number \n" +
                "2. Print descending to -100 from a given number \n" +
                "3. Print all numbers from first to second \n" +
                "4. Print all numbers from smallest to largest\n" +
                "5. Print all even numbers from 1 to 100 \n" +
                "6. Print all odd numbers from 1 to 100 \n" +
                "0. Return to Main Menu");
    }

    private void printSubMenu5() {
        System.out.println("1. Display City list \n" +
                "2. Display city list backwards \n" +
                "3. Display city list and the element position \n" +
                "4. Add a city to the 1st position of the list \n" +
                "5. Add a city to a given position \n" +
                "0. Return to Main Menu");
    }

    private boolean selectItemFromMenu() {
        System.out.print("Please select menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                do {
                    printSubMenu1();
                } while (selectItemFromSubMenu1());
                return true;
            case 2:
                do {
                    printSubMenu2();
                } while (selectItemFromSubMenu2());
                return true;
            case 3:
                do {
                    printSubMenu3();
                } while (selectItemFromSubMenu3());
                return true;
            case 4:
                do {
                    printSubMenu4();
                } while (selectItemFromSubMenu4());
                return true;
            case 5:
                do {
                    printSubMenu5();
                } while (selectItemFromSubMenu5());
                return true;
            case 6:
                happyface();
                return true;
            case 0:
                System.out.println("Goodbye");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private boolean selectItemFromSubMenu1() {

        System.out.print("Please select sub-menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                sum();
                return true;
            case 2:
                difference();
                return true;
            case 3:
                multiply();
                return true;
            case 4:
                divide();
                return true;
            case 5:
                average();
                return true;
            case 0:
                System.out.println("Select menu number");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }

    }


    private boolean selectItemFromSubMenu2() {
        System.out.print("Please select sub-menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                degreesFahrenheitToCelsius();
                return true;
            case 2:
                metersToInches();
                return true;
            case 0:
                printMenu();
                System.out.println("Select menu number");
                selectItemFromMenu();
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }

    }

    private boolean selectItemFromSubMenu3() {
        System.out.print("Please select sub-menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                metersPerSecond();
                return true;
            case 2:
                kilometersPerHour();
                return true;
            case 3:
                milesPerHour();
                return true;
            case 0:
                printMenu();
                System.out.println("Select menu number");
                selectItemFromMenu();
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private boolean selectItemFromSubMenu4() {
        System.out.print("Please select sub-menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                printToHundred();
                return true;
            case 2:
                printDescendingToHundred();
                return true;
            case 3:
                printFromFirstToSecond();
                return true;
            case 4:
                printFromSmallestToLargest();
                return true;
            case 5:
                printEvenToHundred();
                return true;
            case 6:
                printOddNumbers();
                return true;
            case 0:
                printMenu();
                System.out.println("Select menu number");
                selectItemFromMenu();
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private boolean selectItemFromSubMenu5() {
        System.out.print("Please select sub-menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                displayList();
                return true;
            case 2:
                displayListBackwards();
                return true;
            case 3:
                displayIndexAndElement();
                return true;
            case 4:
                addStringToFirstPosition();
                return true;
            case 5:
                addStringToGivenPosition();
                return true;
            case 0:
                printMenu();
                System.out.println("Select menu number");
                selectItemFromMenu();
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }


    public void runProgram() {

        stringList.add("Cluj");
        stringList.add("Bucuresti");
        stringList.add("Timisoara");
        stringList.add("Iasi");
        stringList.add("Constanta");
        stringList.add("Brasov");

        printLoginMenu();
        selectItemFromLoginMenu();
        do {
            printMenu();
        } while (selectItemFromMenu());

    }

//methods for Submenu 1 - mathematical operations

    private void sum() {
        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The sum is: " +
                calc.sum(first, second));
    }

    private void difference() {
        System.out.print("Please enter the first number: ");
        float first = read.getFloat();
        System.out.print("Please enter the second number: ");
        float second = read.getFloat();
        System.out.println("The difference is: " +
                calc.difference(first, second));
    }

    private void multiply() {
        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The result is: " +
                calc.multiply(first, second));


    }

    private void divide() {
        System.out.print("Please enter the first number: ");
        float first = read.getFloat();
        System.out.print("Please enter the second number: ");
        float second = read.getFloat();
        System.out.println("The result is: " +
                calc.divide(first, second));

    }

    private void average() {
        System.out.print("Please enter the first number: ");
        float first = read.getFloat();
        System.out.print("Please enter the second number: ");
        float second = read.getFloat();
        System.out.print("Please enter the third number: ");
        float third = read.getFloat();
        System.out.println("The average is: " +
                calc.average(first, second, third));

    }

//Methods for Submenu 2 - conversions


    private void degreesFahrenheitToCelsius() {
        System.out.print("Please enter the degrees Fahrenheit");
        float degreesFahrenheit = read.getFloat();
        System.out.println(degreesFahrenheit + " degrees Fahrenheit are " + calc.fahrenheitToCelcius(degreesFahrenheit) + " degrees Celsius");

    }

    private void metersToInches() {
        System.out.print("Please enter the value in meters");
        float meters = read.getFloat();
        System.out.println(meters + " meters are " + calc.metersToInches(meters) + " inches");

    }


//Methods for Submenu 3 - speed calculation

    private void metersPerSecond() {
        System.out.print("Please enter the distance in meters: ");
        float meters = read.getFloat();
        System.out.print("Please enter the number of hours: ");
        int timeH = read.getInt();
        System.out.print("Please enter the number of minutes: ");
        int timeM = read.getInt();
        System.out.print("Please enter the number of seconds: ");
        int timeS = read.getInt();
        System.out.println("The speed is " + calc.speedMS(meters, timeH, timeM, timeS) + " meters/second ");


    }

    private void kilometersPerHour() {
        System.out.print("Please enter the distance in meters: ");
        float meters = read.getFloat();
        System.out.print("Please enter the number of hours: ");
        int timeH = read.getInt();
        System.out.print("Please enter the number of minutes: ");
        int timeM = read.getInt();
        System.out.print("Please enter the number of seconds: ");
        int timeS = read.getInt();
        System.out.println("The speed is " + calc.speedKmH(meters, timeH, timeM, timeS) + " kilometers/hour ");
    }

    private void milesPerHour() {
        System.out.print("Please enter the distance in meters: ");
        float meters = read.getFloat();
        System.out.print("Please enter the number of hours: ");
        int timeH = read.getInt();
        System.out.print("Please enter the number of minutes: ");
        int timeM = read.getInt();
        System.out.print("Please enter the number of seconds: ");
        int timeS = read.getInt();
        System.out.println("The speed is " + calc.speedMph(meters, timeH, timeM, timeS) + " miles/hour ");


    }


//Methods for Submenu 4 - Display numbers

    private void printToHundred() {
        System.out.print("Please enter the start number: ");
        int start = read.getInt();
        logic.printTo100(start);

    }

    private void printDescendingToHundred() {
        System.out.print("Please enter the start number: ");
        int start = read.getInt();
        logic.printBackwardsTo100(start);

    }

    private void printFromFirstToSecond() {
        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        logic.printFromXToY(first, second);

    }

    private void printFromSmallestToLargest() {
        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        logic.printFromSmallestToLargest(first, second);

    }

    private void printEvenToHundred() {
        System.out.println("The even numbers from 1 to 100 are: ");
        logic.printEvenNumbers();

    }

    private void printOddNumbers() {
        System.out.println("The odd numbers from 1 to 100 are: ");
        logic.printOddNumbers();
    }


//Methods for Submenu 5 - City list

    private void displayList() {
        System.out.println("The city list contains:");
        stringListOp.printMyList(stringList);


    }

    private void displayListBackwards() {
        System.out.println("The city list contains:");
        stringListOp.printMyListBackwards(stringList);
    }

    private void displayIndexAndElement() {
        System.out.println("The city list contains:");
        stringListOp.displayIndexAndListElement(stringList);

    }

    private void addStringToFirstPosition() {
        System.out.print("Please enter the city");
        String input = scan.next();
        stringListOp.addStringOnFirstPosition(stringList, input);
    }

    private void addStringToGivenPosition() {
        boolean repeat = true;

        System.out.print("Please enter the city");
        String input = scan.next();
        do {
            System.out.print("Please enter the position number");
            int position = read.getInt();
            try {
                stringListOp.addStringToListAtIndex(stringList, position, input);
                repeat = false;
            } catch (IndexOutOfBoundsException e) {
                repeat = true;
                System.out.println("The list doesn't have that many positions");
            }
        } while (repeat);
    }

    private void happyface() {
        System.out.println(display.face());
    }

}













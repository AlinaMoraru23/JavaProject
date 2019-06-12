package com.company.Lab3.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum(50, 23));
        System.out.println(calc.difference(16, 10));
        System.out.println(calc.divide(100, 47));
        System.out.println(calc.multiply(4, 8));
        System.out.println(calc.rest(15, 2));
        System.out.println("the average is " + calc.average(7, 20, 8));
        System.out.println("the weather is " + calc.weather(80) + " degrees Celsius");
        System.out.println("the distance is " + calc.distM(400));
        System.out.println("the speed is " + calc.speedMS(15000, 5, 30, 15) + " m/s");
        System.out.println("the speed is " + calc.speedKmH(15000, 15, 45, 30) + " km/H");
        System.out.println("the speed is " + calc.speedMph(20000, 7, 25, 45) + "mpH");

        Display image = new Display();
        System.out.println(image.text());
        System.out.println(image.face());

// logical Op

        LogicalOp operations = new LogicalOp();

// ex 3 - biggest number
        int biggest = operations.checkBiggerNumber(76, 90);
        System.out.println("The biggest number is " + biggest);

// ex 4 - compare string
        String compare = operations.compareText("FastTrackIT");
        System.out.println(compare);

// ex 5 - compare string + int
        String compare5 = operations.compare5("FastIT", 9);
        System.out.println(compare5);

// ex 6
        String compare6 = operations.compare6(6);
        System.out.println(compare6);
// ex 7
        String compare7 = operations.compare7(90);
        System.out.println(compare7);

// ex 8
        String ex8 = operations.ex8(1);
        System.out.println(ex8);

    }
}
package com.company.lab2.Calculator;

public class Main {
    public static void main(String[] args) {

        // ex 2

        System.out.println(sum(1,7));

        System.out.println(difference(30,10));

        int mpl = multiply(2,35);
        System.out.println(mpl);

        double divm = divide(35,4);
        System.out.println(divm);

        //ex 3
        text();

        //ex 4
        System.out.println(average(3,7,5));

        //ex 5
        face();

        //ex 6
        System.out.println( rest(35,4));

        //ex 7
        System.out.println("The weather is " + weather(90));

        //ex 8
        System.out.println("The distance in meters is " + distM((float) 1150.5) );

        //ex 9

        speed(15000,1,30,15);
    }
    // ex 2
    public static int sum(int firstNo, int secondNo) {
        int resS = firstNo+secondNo;
        return resS;
    }

    public static int difference(int firstNo, int secondNo) {
        int resD = firstNo - secondNo;
        return resD;

    }

    public static int multiply(int firstNo, int secondNo) {
        int resM = firstNo * secondNo;
        return resM;

    }

    public static float divide(float firstNo, float secondNo) {
        float resD = firstNo / secondNo;
        return resD;


    }
    // ex 3
    public static void text() {
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }


    // ex 4


    public static float average(int firstNo, int secondNo, int thirdNo) {
        float avg = (firstNo + secondNo + thirdNo)/3;
                return avg;

    }
    // ex 5

    public static void face() {
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
    }



    // ex 6

    public static int rest(int firstNo, int secondNo) {
        int resR  = firstNo%secondNo;
        return resR;

    }
    // ex 7

    public static float weather(int degreesF) {
        float resW = ((5f/9)*(degreesF-32));

        return resW;

    }
    // ex 8

    public static double distM(float inch) {
        double resDM = 0.0254*inch;
        return resDM;
    }
    // ex 9

    public static void speed(float distM, float timeH, float timeM, float timeS){
        float sp1 = distM/((3600*timeH)+(60*timeM)+timeS);

        float km = distM/1000;
        float hours = timeH+(timeM/60)+(timeS/3600);
        float sp2 = km / hours;

        double sp3 = (km/1.609)/hours;

        System.out.println("Speed in m/s is " + sp1);
        System.out.println("Speed in km/h is "+ sp2);
        System.out.println("Speed in mph is " + sp3);
    }
}
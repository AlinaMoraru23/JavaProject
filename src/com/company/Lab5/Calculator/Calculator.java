package com.company.Lab5.Calculator;

public class Calculator {


//operations

//sum
    public int sum(int firstNo, int secondNo) {
        int resS = firstNo + secondNo;
        return resS;
    }

    public float sum (float firstNo, float secondNo, float thirdNo){
        float resS = firstNo + secondNo + thirdNo;
        return resS;
    }

//difference
    public int difference(int firstNo, int secondNo) {
        int resD = firstNo - secondNo;
        return resD;
    }

    public float difference(float firstNo, float secondNo){
        float resD = firstNo - secondNo;
        return resD;

    }

//multiply
    public int multiply(int firstNo, int secondNo) {
        int resM = firstNo * secondNo;
        return resM;

    }

    public float multiply(float firstNo, float secondNo, float  thirdNo){
        float resM = firstNo * secondNo * thirdNo;
        return resM;
    }

//divide
    public float divide(float firstNo, float secondNo) {
        float resD = firstNo / secondNo;
        return resD;
    }


    public int divide (int firstNo, int secondNo){
        int resD = firstNo/secondNo;
        return resD;
    }


//average
    public float average(float firstNo, float secondNo, float thirdNo) {
        float avg = (firstNo + secondNo + thirdNo) / 3;
        return avg;
    }

    public float average( float firstNo, float secondNo, float thirdNo, float forthNo){
        float avg = (firstNo + secondNo + thirdNo + forthNo)/4;
        return avg;

    }

    public  int rest(int firstNo, int secondNo) {
        int resR = firstNo % secondNo;
        return resR;

    }

//convert degrees F to C
    public  float weather(int degreesF) {
        float resW = ((5f / 9) * (degreesF - 32));

        return resW;
    }

//convert distance in meters to inches
    public double distM(float inch) {
        double resDM = 0.0254 * inch;
        return resDM;
    }

//calculate speed meters/second
    public float speedMS(float distM, float timeH, float timeM, float timeS) {
        float spMS = distM / ((3600f * timeH) + (60f * timeM) + timeS);

        return spMS;
    }

//calculate speed kilometers/hour
    public float speedKmH(float distM, float timeH, float timeM, float timeS){
        float km = distM / 1000;
        float hours = timeH + (timeM / 60) + (timeS / 3600);
        float spKmH = km / hours;

        return spKmH;

    }

//calculate speed miles/hour
    public float speedMph(float distM, float timeH, float timeM, float timeS) {
        float km = distM / 1000;
        float hours = timeH + (timeM / 60) + (timeS / 3600);
        float spMph = (km / 1.609f) / hours;

        return spMph;
    }
}

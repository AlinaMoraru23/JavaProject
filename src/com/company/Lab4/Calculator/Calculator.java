package com.company.Lab4.Calculator;

public class Calculator {

    public int sum(int firstNo, int secondNo) {
        int resS = firstNo + secondNo;
        return resS;
    }

    public int difference(int firstNo, int secondNo) {
        int resD = firstNo - secondNo;
        return resD;

    }

    public int multiply(int firstNo, int secondNo) {
        int resM = firstNo * secondNo;
        return resM;

    }

    public float divide(float firstNo, float secondNo) {
        float resD = firstNo / secondNo;
        return resD;
    }

    public float average(float firstNo, float secondNo, float thirdNo) {
        float avg = (firstNo + secondNo + thirdNo) / 3;
        return avg;
    }


    public  int rest(int firstNo, int secondNo) {
        int resR = firstNo % secondNo;
        return resR;

    }
    public  float weather(int degreesF) {
        float resW = ((5f / 9) * (degreesF - 32));

        return resW;
    }
    public double distM(float inch) {
        double resDM = 0.0254 * inch;
        return resDM;
    }

    public float speedMS(float distM, float timeH, float timeM, float timeS) {
        float spMS = distM / ((3600f * timeH) + (60f * timeM) + timeS);

        return spMS;
    }

    public float speedKmH(float distM, float timeH, float timeM, float timeS){
        float km = distM / 1000;
        float hours = timeH + (timeM / 60) + (timeS / 3600);
        float spKmH = km / hours;

        return spKmH;

    }

    public float speedMph(float distM, float timeH, float timeM, float timeS) {
        float km = distM / 1000;
        float hours = timeH + (timeM / 60) + (timeS / 3600);
        float spMph = (km / 1.609f) / hours;

        return spMph;
    }
}

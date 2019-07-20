package com.company.JavaConsoleLineProgram;

 class Calculator {

    //sum
    int sum(int firstNo, int secondNo) {
        int resS = firstNo + secondNo;
        return resS;
    }

    //difference
    float difference(float firstNo, float secondNo) {
        float resD = firstNo - secondNo;
        return resD;
    }

    //multiply
    int multiply(int firstNo, int secondNo) {
        int resM = firstNo * secondNo;
        return resM;
    }

    //divide
    float divide(float firstNo, float secondNo) {
        float resD = firstNo / secondNo;
        return resD;
    }

    //average
    float average(float firstNo, float secondNo, float thirdNo) {
        float avg = (firstNo + secondNo + thirdNo) / 3;
        return avg;
    }

    //convert degrees F to C
    float fahrenheitToCelcius(float degreesF) {
        float result = ((5f / 9) * (degreesF - 32));

        return result;
    }

    //convert distance in meters to inches
    float metersToInches(float inch) {
        float result = 0.0254f * inch;
        return result;
    }

    //calculate speed meters/second
    float speedMS(float distM, int timeH, int timeM, int timeS) {
        float spMS = distM / ((3600f * timeH) + (60f * timeM) + timeS);

        return spMS;
    }

    //calculate speed kilometers/hour
    float speedKmH(float distM, float timeH, float timeM, float timeS) {
        float km = distM / 1000;
        float hours = timeH + (timeM / 60) + (timeS / 3600);
        float spKmH = km / hours;

        return spKmH;

    }

    float speedMph(float distM, float timeH, float timeM, float timeS) {
        float km = distM / 1000;
        float hours = timeH + (timeM / 60) + (timeS / 3600);
        float spMph = (km / 1.609f) / hours;

        return spMph;
    }

}

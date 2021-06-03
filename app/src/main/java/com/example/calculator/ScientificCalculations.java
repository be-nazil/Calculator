package com.example.calculator;

public class ScientificCalculations {

    public Double log(String val){
       double number = Double.parseDouble(val);
       return   Math.log10(number);
    }

    public Double ln(String val){
        double number = Double.parseDouble(val);
        return   Math.log(number);
    }

    public Double power(String strNum1, String strNum2){
        double number1 = Double.parseDouble(strNum1);
        double number2 = Double.parseDouble(strNum2);
        return Math.pow(number1, number2);
    }

    public Double root(String val){
        double number = Double.parseDouble(val);
        return   Math.sqrt(number);
    }

    public Double factorial(String val){
        double number = Double.parseDouble((val));
        int i = Integer.parseInt(val) - 1;

        while (i > 0) {
            number = number * i;
            i--;
        }

        return number;
    }

    public Double sin(String val){
        double number = Double.parseDouble(val);
        return   Math.sin(number);
    }

    public Double cos(String val){
        double number = Double.parseDouble(val);
        return   Math.cos(number);
    }

    public Double tan(String val){
        double number = Double.parseDouble(val);
        return   Math.tan(number);
    }

}

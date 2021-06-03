package com.example.calculator;

public class BasicCalculations {

    public Double Addition(String strNum1, String strNum2){
       Double number1 = Double.parseDouble(strNum1);
       Double number2 = Double.parseDouble(strNum2);
        return number1 + number2;
    }

    public Double Subtraction(String strNum1, String strNum2){
        Double number1 = Double.parseDouble(strNum1);
        Double number2 = Double.parseDouble(strNum2);
        return number1 - number2;
    }

    public Double Multiplication(String strNum1, String strNum2){
        Double number1 = Double.parseDouble(strNum1);
        Double number2 = Double.parseDouble(strNum2);
        return number1 * number2;
    }

    public Double Division(String strNum1, String strNum2){
        Double number1 = Double.parseDouble(strNum1);
        Double number2 = Double.parseDouble(strNum2);
        return number1 / number2;
    }

}

package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

class TestingCalculator {
    public static void main(String[] args){

        Calculator calculator = new Calculator();
        int result = calculator.AddAToB(10, 40);
        int result2 = calculator.substractAToB(40, 5);

            if (result == 50) {
                System.out.println("Test przebiegl pomyslnie!");
            } else {
                System.out.println("Fatal error!");
            }

            if (result2 == 35){
                System.out.println("Test 2 przebiegl pomyslnie!");
            } else {
                System.out.println("Fatal error!");
            }
    }
}

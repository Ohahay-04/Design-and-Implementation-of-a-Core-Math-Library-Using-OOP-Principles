/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcj;

/**
 *
 * @author Student
 */
public class NumberAnalysis extends MathOP {

    @Override
    public double calculate() {
        return 0;
    }

    public String primeCheck() {

        double[] ops = getOperands();
        double n = ops[0];

        if (n <= 1) {
            return "This is not a prime number.";
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                
                return "This is not a prime number.";
            }
        }

        return "This is a prime number.";
    }

    public String Factorial() {

        double[] ops = getOperands();
        double n = ops[0];
        long result = 1;

        if (n < 0) {
            return "The factorial is not defined for negative numbers unless I use Math.abs FOR ABSOLUTE value ";
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return String.valueOf(result) + ".";
    }
}

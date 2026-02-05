/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopcj;

import java.util.Arrays;

/**
 *
 * @author Student
 */
public class OOPCJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArithmeticOp cj = new ArithmeticOp();
        GeometryOP cj2 = new GeometryOP();
        NumberAnalysis cj3 = new NumberAnalysis();
        
        System.out.println("Mathematical computations Library");
        cj.setOperands(); //Test 2.1 - Addition Operation
        System.out.println("When you add  " + Arrays.toString(cj.getOperands()) + "the result is: " + cj.addAll() + ".");

        cj.setOperands(45, 0);    //Test 2.2 - Divide into Zero
        System.out.println("When you divide " + Arrays.toString(cj.getOperands()) + " the result is: " + cj.divideAll() + ".");

        cj2.setOperands(5);         //Test 3.1 - Area of circle Calculation
        System.out.println("Finding the area of circle if it has radius of " + Arrays.toString(cj2.getOperands()) + "the result is: " + cj2.ComputeArea() + ".");

        cj2.setOperands(-3);        //Test 3.2 - invalid shape dimension
        System.out.println("The area of a circle that has a radius of " + Arrays.toString(cj2.getOperands()) + " is: " + cj2.ComputeArea() + ".");

        cj3.setOperands(7);         //Test  4.1  Prime Number Check
        System.out.println("The number " + Arrays.toString(cj3.getOperands()) + " is: " + cj3.primeCheck());

        cj3.setOperands(10);        //Test 4.2 - Non-prime Number Check
        System.out.println("The number " + Arrays.toString(cj3.getOperands()) + " is: " + cj3.primeCheck());

        cj3.setOperands(5);         //Test 4.3 - Factorial 
        System.out.println("The factorial of the number " + Arrays.toString(cj3.getOperands()) + " is: " + cj3.Factorial());

    }
    
}

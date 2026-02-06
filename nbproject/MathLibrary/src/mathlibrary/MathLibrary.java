/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathlibrary;
import java.util.Arrays;
/**
 *
 * @author user
 */
public class MathLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                     
        
       System.out.println("WELCOME TO MATH LIBRARY");
       
        //arith.operands = new double[]{1,2,3};   //Test case 1.1 - Attribute Protection
        //I attempted to modify the internal data of "arith" directly, but since it is private, the data cannot be modified without setters.
        System.out.println("ARITHMETIC OPERATION");
        ARITHMETICoperation arit = new ARITHMETICoperation();
        
        arit.setOperands(12,10);   //Test  2.1 - Addition Operation
        System.out.println("The result of adding " + Arrays.toString(arit.getOperands())  + " is: " + arit.addAll() + "." );
        
        arit.setOperands(13 , 0);    //Test  2.2 - Division by Zero
        System.out.println("The result of dividing " + Arrays.toString(arit.getOperands())  + " is: " + arit.divideAll()+ "." );
        System.out.println("GEOMETRIC OPERATION");
        GEOMETRYoperation geo = new GEOMETRYoperation();
        
        geo.setOperands(41);         //Test  3.1 - Circle Area Calculation
        System.out.println("The area of a circle that has a radius of " + Arrays.toString(geo.getOperands()) + " is: " + geo.ComputeArea() + ".");
        
        geo.setOperands(-4);        //Test  3.2 - Invalid Shape Dimension
        System.out.println("The area of a circle that has a radius of " + Arrays.toString(geo.getOperands()) + " is: " + geo.ComputeArea() + ".");
        System.out.println("NUMBER ANALYSIS");
        NUMBERanalysis nal = new NUMBERanalysis();
        
        nal.setOperands(12);         //Test  4.1 - Prime Number Check
        System.out.println("The number " + Arrays.toString( nal.getOperands() ) + " is: " + nal.primeCheck() );
        
        nal.setOperands(21);        //Test  4.2 - Non-prime Number Check
        System.out.println("The number " + Arrays.toString( nal.getOperands() ) + " is: " + nal.primeCheck() );
        
        nal.setOperands(8);         //Test  4.3 - Factorial Computation
        System.out.println("The factorial of the number " + Arrays.toString( nal.getOperands() ) + " is: " + nal.Factorial() );
        
    }
    

    
}
        
        /*  
           Here is the class hierarchy: MathematicalOperations is the base/parent class. ArithmeticOperations, GeometryOperations, and NumberAnalysis are the names of all the child classes.
To prevent direct external alteration, all attributes are set to private. This implies that only setters can change the values, and only getters can get the data.
To prevent mistakes in this task, inheritance is crucial. Each class would have to handle data in a unique way if inheritance didn't exist. Only the base class manages the data in this manner, and getters are used by each child class to retrieve the data from the base class.

*/

    
    


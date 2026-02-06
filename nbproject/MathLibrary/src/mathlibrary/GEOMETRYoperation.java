/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathlibrary;

/**
 *
 * @author user
 */
public class GEOMETRYoperation extends mathOPERATION {
    
    @Override
    
    public double calculate() {
        return 0;
    }
    
    public String ComputeArea() {
        double[] ops = getOperands();
        double singlevalue = ops[0];
        if ( ops == null || ops.length < 1 ) {
            return "0";
        }
        else if ( singlevalue < 1 ) {
            return "This circle has a negative radius";
        }
        
        
        return String.valueOf(Math.PI * Math.pow(singlevalue, 2));
        
    }
    
    public double ComputeCircumference() {
        double[] ops = getOperands();
        if ( ops == null || ops.length < 1 ) {
            return 0;
    }
    
        double radius = ops[0];
        return 2 * Math.PI * radius;
}

   
}
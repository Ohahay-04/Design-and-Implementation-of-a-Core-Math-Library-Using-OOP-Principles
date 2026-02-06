/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathlibrary;

/**
 *
 * @author user
 */
public abstract class mathOPERATION {
   
    private double[] operands;
    
    public void setOperands(double... values) {
        this.operands = values;
    }
    
    
    
    public double[] getOperands() {
        return operands;
    }
    
    public abstract double calculate();
}


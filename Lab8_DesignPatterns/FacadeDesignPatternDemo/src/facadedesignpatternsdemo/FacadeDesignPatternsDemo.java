/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadedesignpatternsdemo;

/**
 * The FacadeDesignPatternsDemo is a concrete class which contains the main() method to run the project.
 * This class demonstrates how the Façade Design Pattern is useful
 * @author rishabhkaushick
 */
public class FacadeDesignPatternsDemo {

    /**
     * The main() method, from which Java starts executing code.
     * @param args the command line arguments
     * @author rishabhkaushick
     * @version 1.0
     */
    public static void main(String[] args) {
        
        // Facade Design Pattern
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        
    }
    
}

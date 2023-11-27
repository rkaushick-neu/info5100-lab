/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorydesignpatterndemo;

/**
 * The FactoryDesignPatternDemo is a concrete class which contains the main() method to run the project.
 * @author rishabhkaushick
 * @version 1.0
 */
public class FactoryDesignPatternDemo {

    /**
     * The main() method, from which Java starts executing code.
     * @param args the command line arguments
     * @author rishabhkaushick
     * @version 1.0
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpatterndemo;

/**
 * ShapeFactory is a concrete class which represents the Factory Design Pattern.
 * @author rishabhkaushick
 * @version 1.0
 */
public class ShapeFactory {

    /** 
     * Nothing to initialize in the ShapeFactory constructor.
     * @author rishabhkaushick
     * @version 1.0
     */
    public ShapeFactory() {}

    /**
     * The getShape method takes in an argument shapeType, and returns the respective Shape Object.
     * Legal values for shapeType are - CIRCLE, RECTANGLE, SQUARE.
     * Return values are objects of Circle, Rectangle and Square objects.
     * @param shapeType Type of the shape in String format.
     * @return Respective Shape object.
     * @author rishabhkaushick
     * @version 1.0
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

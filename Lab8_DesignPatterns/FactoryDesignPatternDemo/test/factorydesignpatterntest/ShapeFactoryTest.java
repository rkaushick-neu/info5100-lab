/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package factorydesignpatterntest;

import factorydesignpatterndemo.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The ShapeFactoryTest is a JUnit Test class for testing the ShapeFactory class.
 * @author rishabhkaushick
 */
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
    }
    
    /**
     * The getShapeTest() method is used to test the getShape() method from ShapeFactory class.
     * Since the Factory method returns a new object each time, we are testing by checking the data-types of the objects.
     * This can be done using the getClass() method.
     * @version 1.0
     */
    @Test
    public void getShapeTest(){
        ShapeFactory shapeFactory = new ShapeFactory();
        
        /** Testing for Circle objects */
        Circle circle = new Circle();
        /** Positive Test cases - Capitalization of characters should not matter */
        assertEquals(circle.getClass(), shapeFactory.getShape("CIRCLE").getClass());
        assertEquals(circle.getClass(), shapeFactory.getShape("circle").getClass());
        assertEquals(circle.getClass(), shapeFactory.getShape("CiRcLe").getClass());   
        /** Negative Test Cases */
        assertNull(shapeFactory.getShape("One Circle Please"));
        assertNotEquals(circle.getClass(), shapeFactory.getShape("RECTANGLE").getClass());
        assertNotEquals(circle.getClass(), shapeFactory.getShape("SQUARE").getClass());
        
        /** Testing for Rectangle objects */
        Rectangle rectangle = new Rectangle();
        /** Positive Test cases - Capitalization of characters should not matter */
        assertEquals(rectangle.getClass(), shapeFactory.getShape("RECTANGLE").getClass());
        assertEquals(rectangle.getClass(), shapeFactory.getShape("rectangle").getClass());
        assertEquals(rectangle.getClass(), shapeFactory.getShape("RectANGLE").getClass());
        /** Negative Test Cases */
        assertNull(shapeFactory.getShape("Just a rectangle - to go!"));
        assertNotEquals(rectangle.getClass(), shapeFactory.getShape("SQUARE").getClass());
        assertNotEquals(rectangle.getClass(), shapeFactory.getShape("CIRCLE").getClass());
        
        
        /** Testing for Square objects */
        Square square = new Square();
        /** Positive Test cases - Capitalization of characters should not matter */
        assertEquals(square.getClass(), shapeFactory.getShape("SQUARE").getClass());
        assertEquals(square.getClass(), shapeFactory.getShape("square").getClass());
        assertEquals(square.getClass(), shapeFactory.getShape("SqUaRE").getClass());
        /** Negative Test Cases */
        assertNull(shapeFactory.getShape("Pocket Square"));
        assertNotEquals(square.getClass(), shapeFactory.getShape("RECTANGLE").getClass());
        assertNotEquals(square.getClass(), shapeFactory.getShape("CIRCLE").getClass());
        
        /** Testing Other Negative Test Cases */
        assertNull(shapeFactory.getShape(null));
        assertNull(shapeFactory.getShape(""));
    }
}

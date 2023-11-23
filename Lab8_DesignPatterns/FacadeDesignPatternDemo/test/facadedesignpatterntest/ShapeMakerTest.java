/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package facadedesignpatterntest;

import facadedesignpatternsdemo.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The ShapeMakerTest is a JUnit Test class for testing the ShapeMaker class.
 * @author rishabhkaushick
 * @version 1.1
 */
public class ShapeMakerTest {
    
    public ShapeMakerTest() {
    }
    
    @Test
    public void drawCircleTest(){
        ShapeMaker shapeMakerFacade = new ShapeMaker();
        Circle circle = new Circle();
        /** Positive Test Case */
        assertEquals(circle.draw(), shapeMakerFacade.drawCircle());
        assertEquals("Circle::draw()", shapeMakerFacade.drawCircle());
        
        /** Negative Test Case */
        assertNotEquals("Circle", shapeMakerFacade.drawCircle());
        assertNotEquals("", shapeMakerFacade.drawCircle());
        assertNotEquals("Circle::draw()", shapeMakerFacade.drawRectangle());
        assertNotEquals("Circle::draw()", shapeMakerFacade.drawSquare());
    }
    
    @Test
    public void drawRectangleTest(){
        ShapeMaker shapeMakerFacade = new ShapeMaker();
        Rectangle rectangle = new Rectangle();
        
        /** Positive Test Case */
        assertEquals(rectangle.draw(), shapeMakerFacade.drawRectangle());
        assertEquals("Rectangle::draw()", shapeMakerFacade.drawRectangle());
        
        /** Negative Test Case */
        assertNotEquals("Rectangle draw()", shapeMakerFacade.drawRectangle());
        assertNotEquals("", shapeMakerFacade.drawRectangle());
        assertNotEquals("Rectangle::draw()", shapeMakerFacade.drawCircle());
        assertNotEquals("Rectangle::draw()", shapeMakerFacade.drawSquare());
    }
    
    @Test
    public void drawSquareTest(){
        ShapeMaker shapeMakerFacade = new ShapeMaker();
        Square square = new Square();
        
        /** Positive Test Case */
        assertEquals(square.draw(), shapeMakerFacade.drawSquare());
        assertEquals("Square::draw()", shapeMakerFacade.drawSquare());
        /** Negative Test Case */
        assertNotEquals("Square draw()", shapeMakerFacade.drawSquare());
        assertNotEquals("", shapeMakerFacade.drawSquare());
        assertNotEquals("Square::draw()", shapeMakerFacade.drawCircle());
        assertNotEquals("Square::draw()", shapeMakerFacade.drawRectangle());
    }
}

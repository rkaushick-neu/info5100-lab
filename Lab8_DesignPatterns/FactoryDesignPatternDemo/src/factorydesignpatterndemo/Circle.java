/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpatterndemo;

/**
 * Circle is a concrete class which implements the Shape interface.
 * @author rishabhkaushick
 * @version 1.0
 */
public class Circle implements Shape {

    /**
     * The draw() method for the Circle class prints the text "Circle::draw()".
     * @author rishabhkaushick
     * @version 1.0
     */
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
    
}

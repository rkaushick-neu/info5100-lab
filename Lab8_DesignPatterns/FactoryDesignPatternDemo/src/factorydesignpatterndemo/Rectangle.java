/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpatterndemo;

/**
 * Rectangle is a concrete class which implements the Shape interface.
 * @author rishabhkaushick
 * @version 1.0
 */
public class Rectangle implements Shape {

    /** 
     * The draw() method for the Rectangle class prints the text "Rectangle::draw()".
     * @author rishabhkaushick
     * @version 1.0
     */
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
    
}

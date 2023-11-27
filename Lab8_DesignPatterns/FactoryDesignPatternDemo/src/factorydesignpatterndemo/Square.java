/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpatterndemo;

/**
 * Square is a concrete class which implements the Shape interface.
 * @author rishabhkaushick
 * @version 1.0
 */
public class Square implements Shape {

    /** 
     * The draw() method for the Square class prints the text "Square::draw()".
     * @author rishabhkaushick
     * @version 1.0
     */
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
    
}

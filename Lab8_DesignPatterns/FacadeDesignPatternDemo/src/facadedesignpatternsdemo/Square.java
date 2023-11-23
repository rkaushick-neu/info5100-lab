/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpatternsdemo;

/**
 * Square is a concrete class which implements the Shape interface.
 * @author rishabhkaushick
 * @version 1.1
 */
public class Square implements Shape {

    @Override
    public String draw() {
        System.out.println("Square::draw()");
        return "Square::draw()";
    }
    
}

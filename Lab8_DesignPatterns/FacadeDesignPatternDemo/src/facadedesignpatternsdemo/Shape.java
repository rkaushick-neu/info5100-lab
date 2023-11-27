/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package facadedesignpatternsdemo;

/**
 * This is a Shape Interface class.
 * It contains one method draw().
 * @author rishabhkaushick
 * @version 1.1
 */
public interface Shape {
    /**
     * Each concrete class which implement the Shape interface must have their own definition of the draw() method.
     * @author rishabhkaushick
     * @version 1.0
     */
    String draw();
}

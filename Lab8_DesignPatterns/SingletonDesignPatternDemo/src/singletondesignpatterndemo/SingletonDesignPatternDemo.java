/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletondesignpatterndemo;

/**
 * The SingletonDesignPatternDemo is a concrete class which shows the functionality of the Singleton Design Pattern.
 * @author rishabhkaushick
 * @version 1.0
 */
public class SingletonDesignPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //illegal construct
        // SingleObject newObject = new SingleObject();
        
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
    
}

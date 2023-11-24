/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletondesignpatterndemo;

/**
 * SingleObject is a concrete class which represents the Singleton Design Pattern.
 * @author rishabhkaushick
 * @version 1.0
 */
public class SingleObject {
    
    // creating an object of the SingleObject
    private static SingleObject instance = new SingleObject();
    
    // making the constructor private so that it cannot be instantiated
    private SingleObject(){}
    
    /**
     * This is the method through which we get access to the Singleton Object
     * @version 1.0
     * @return A singleton object
     */
    public static SingleObject getInstance(){
        return instance;
    }
    
    /**
     * This is a method in which we can write our logic - in this case printing Hello World from the Singleton Class.
     * @version 1.0
     * @return String
     */
    public String showMessage(){
        System.out.println("Hello world from the Singleton Class!");
        return "Hello world from the Singleton Class!";
    }
}

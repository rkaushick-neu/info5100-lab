/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletondesignpatterndemo;

/**
 * SingleObject is a concrete class which represents the Singleton Design Pattern.
 * @author rishabhkaushick
 */
public class SingleObject {
    
    // creating an object of the SingleObject
    private static SingleObject instance = new SingleObject();
    
    // making the constructor private so that it cannot be instantiated
    private SingleObject(){}
    
    //getting the only object available
    public static SingleObject getInstance(){
        return instance;
    }
    
    public String showMessage(){
        System.out.println("Hello world from the Singleton Class!");
        return "Hello world from the Singleton Class!";
    }
}

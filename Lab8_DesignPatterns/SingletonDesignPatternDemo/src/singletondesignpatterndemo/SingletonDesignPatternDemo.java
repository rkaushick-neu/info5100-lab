/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletondesignpatterndemo;

/**
 *
 * @author rishabhkaushick
 */
public class SingletonDesignPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //illegal construct
//        SingleObject newObject = new SingleObject();
        
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
    
}

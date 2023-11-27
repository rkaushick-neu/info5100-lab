/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package singletondesignpatterndemotest;

import static org.junit.Assert.*;
import org.junit.Test;

import singletondesignpatterndemo.SingleObject;

/**
 * The SingleObjectTest is a JUnit Test class for testing the SingleObject class.
 * @author rishabhkaushick
 * @version 1.0
 */
public class SingleObjectTest {
    
    public SingleObjectTest() {
    }
    
    /**
     * The getInstanceTest() method is used to test the getInstance() method from SingleObject class.
     * @author rishabhkaushick
     * @version 1.0
     */
    @Test
    public void getInstanceTest(){
        
        /** The correct way to initialize the instance: */
        SingleObject so = SingleObject.getInstance();
        assertEquals(so, SingleObject.getInstance());
        
        /** The wrong way to initialize the instance */
        /**
         * The wrong way to initialize the instance.
         * try{
         *   SingleObject so1 = new SingleObject();
         *   assertFalse(true);
         * } catch (RuntimeException e){
         *  If we initialize the variable as above, it will throw a java run-time exception
         *  Therefore, if we receive the run-time exception, we can say that the Singleton class has been implemented correctly
         *   assertTrue(true);
         *   }
         * 
         */
        
    }
    
    /**
     * The showMessageTest() method is used to test the showMessage() method from SingleObject class.
     * @author rishabhkaushick
     * @version 1.0
     */
    @Test
    public void showMessageTest(){
        SingleObject so = SingleObject.getInstance();
        
        /** Positive Test Case */
        assertEquals("Hello world from the Singleton Class!", so.showMessage());
        
        /** Negative Test Case */
        assertNotEquals("Singleton Class Only", so.showMessage());
    }
}

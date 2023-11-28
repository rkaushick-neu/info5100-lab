/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moonroverstatepatterndemo;

/**
 *
 * @author rishabhkaushick
 * @version 1.0
 */
public class MoonRoverStatePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /** Creating a moon rover instance */
        MoonRoverContext moonRover = new MoonRoverContext();
        
        /** This shows that the moon rover is currently at rest. */
        System.out.println(moonRover.getBuggyState().toString());
        
        /** Pressing the left pedal once. */
        moonRover.getBuggyState().pressLeftPedalOnce(moonRover);
        System.out.println(moonRover.getBuggyState().toString());
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatepatterndemo;

/**
 * AtRestState class defines when the Buggy is at rest.
 * @author rishabhkaushick
 * @version 1.0
 */
public class AtRestState implements State{

    /**
     * When the left pedal is pressed once while the buggy is at rest, it accelerates forward.
     * @param buggyContext Refers to the current context of the buggy.
     * @return String
     * @author rishabhkaushick
     * @version 1.0
     */
    @Override
    public String pressLeftPedalOnce(MoonRoverContext buggyContext) {
        System.out.println("Pressing Left Pedal once.");
        buggyContext.setBuggyState(new AccelerateForwardsState());
        return "Accelerate Forward!";
    }

    /**
     * When the left pedal is pressed for 3 seconds while the buggy is at rest, it accelerates backwards.
     * @param buggyContext Refers to the current context of the buggy.
     * @return String
     * @author rishabhkaushick
     * @version 1.0
     */
    @Override
    public String pressLeftPedalFor3Sec(MoonRoverContext buggyContext) {
        return "Accelerate Backward!";
    }

    /**
     * When the right pedal is pressed once while the buggy is at rest, it does nothing.
     * @param buggyContext Refers to the current context of the buggy.
     * @return String
     * @author rishabhkaushick
     * @version 1.0
     */
    @Override
    public String pressRightPedalOnce(MoonRoverContext buggyContext) {
        return "Do Nothing!";
    }

    /**
     * When the right pedal is pressed for 3 seconds while the buggy is at rest, it does nothing.
     * @param buggyContext Refers to the current context of the buggy.
     * @return String
     * @author rishabhkaushick
     * @version 1.0
     */
    @Override
    public String pressRightPedalFor3Sec(MoonRoverContext buggyContext) {
        return "Do Nothing!";
    }
    
    /**
     * Overriding the toString function for displaying the class.
     * @return String
     * @author rishabhkaushick
     * @version 1.0
     */
    @Override
    public String toString(){
        return "Moon Rover at rest";
    }
}

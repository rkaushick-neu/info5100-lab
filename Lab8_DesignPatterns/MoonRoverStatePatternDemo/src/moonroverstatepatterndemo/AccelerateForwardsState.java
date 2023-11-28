/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatepatterndemo;

/**
 *
 * @author rishabhkaushick
 * @version 1.0
 */
public class AccelerateForwardsState implements State {

    /**
     * When the left pedal is pressed once while the buggy is accelerating forward, it does nothing.
     * @param buggyContext Refers to the current context of the buggy.
     * @return String
     * @author rishabhkaushick
     * @version 1.0
     */
    @Override
    public String pressLeftPedalOnce(MoonRoverContext buggyContext) {
        return "Do Nothing!";
    }

    /**
     * When the left pedal is pressed for 3 seconds while the buggy is accelerating forward, it goes into constant speed.
     * @param buggyContext Refers to the current context of the buggy.
     * @return String
     * @author rishabhkaushick
     * @version 1.0
     */
    @Override
    public String pressLeftPedalFor3Sec(MoonRoverContext buggyContext) {
        return "Constant Speed Forward!";
    }

    /**
     * When the right pedal is pressed once while the buggy is accelerating forward, it does nothing.
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
     * When the right pedal is pressed for 3 seconds while the buggy is accelerating forward, it does nothing.
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
        return "Accelerating Forwards state.";
    }
}

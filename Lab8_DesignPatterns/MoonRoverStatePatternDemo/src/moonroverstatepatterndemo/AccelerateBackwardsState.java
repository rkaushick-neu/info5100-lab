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
public class AccelerateBackwardsState implements State {

    @Override
    public String pressLeftPedalOnce(MoonRoverContext buggyContext) {
        return "";
    }

    @Override
    public String pressLeftPedalFor3Sec(MoonRoverContext buggyContext) {
        return "";
    }

    @Override
    public String pressRightPedalOnce(MoonRoverContext buggyContext) {
        return "";
    }

    @Override
    public String pressRightPedalFor3Sec(MoonRoverContext buggyContext) {
        return "";
    }
    
    /**
     * Overriding the toString function for displaying the class.
     * @return String
     * @author rishabhkaushick
     * @version 1.0
     */
    @Override
    public String toString(){
        return "Accelerating Backwards state.";
    }
    
}

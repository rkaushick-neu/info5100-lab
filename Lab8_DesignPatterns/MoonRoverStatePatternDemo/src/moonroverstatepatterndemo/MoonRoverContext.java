/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatepatterndemo;

/**
 * The MoonRoverContext class stores the state in which the buggy is in currently.
 * @author rishabhkaushick
 * @version 1.0
 */
public class MoonRoverContext {
    /** The moonRoverState class variable is the one in which we store the state of the moon rover. */
    State moonRoverState;
    
    /**
     * Non-parameterized constructor - Nothing to do here.
     */
    public MoonRoverContext(){
        this.moonRoverState = new AtRestState();
    }
    /**
     * Parameterized constructor to set the value of moon rover state.
     * @param moonRoverState The current state of the moon rover.
     */
    public MoonRoverContext(State moonRoverState) {
        this.moonRoverState = moonRoverState;
    }

    public State getBuggyState() {
        return moonRoverState;
    }

    public void setBuggyState(State moonRoverState) {
        this.moonRoverState = moonRoverState;
    }
    
    
}

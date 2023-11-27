/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonroverstatepatterndemo;

/**
 * The Context class stores the state in which the buggy is in currently.
 * @author rishabhkaushick
 * @version 1.0
 */
class Context {
    /** The buggyState class variable is the one in which we store the state of the buggy. */
    State buggyState;
    
    /**
     * Non-parameterized constructor - Nothing to do here.
     */
    public Context(){
    }
    /**
     * Parameterized constructor to set the value of buggy state.
     * @param buggyState The current state of the buggy.
     */
    public Context(State buggyState) {
        this.buggyState = buggyState;
    }

    public State getBuggyState() {
        return buggyState;
    }

    public void setBuggyState(State buggyState) {
        this.buggyState = buggyState;
    }
    
    
}

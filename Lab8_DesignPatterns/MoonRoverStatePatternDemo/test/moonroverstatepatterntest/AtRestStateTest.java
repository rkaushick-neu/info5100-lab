/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package moonroverstatepatterntest;

import org.junit.Test;
import static org.junit.Assert.*;
import moonroverstatepatterndemo.*;

/**
 *
 * @author rishabhkaushick
 * @version 1.0
 */
public class AtRestStateTest {
    
    public AtRestStateTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void pressLeftPedalOnceTest(){
        AtRestState restState = new AtRestState();
        MoonRoverContext moonRoverContext = new MoonRoverContext();
        assertEquals("Accelerate Forward!", restState.pressLeftPedalOnce(moonRoverContext));
    }
    
    @Test
    public void pressLeftPedalFor3SecTest(){
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package moonroverstatepatterndemo;

/**
 *
 * @author rishabhkaushick
 * @version 1.0
 */
public interface State {
    public String pressLeftPedalOnce(MoonRoverContext buggyContext);
    public String pressLeftPedalFor3Sec(MoonRoverContext buggyContext);
    public String pressRightPedalOnce(MoonRoverContext buggyContext);    
    public String pressRightPedalFor3Sec(MoonRoverContext buggyContext);
    
}

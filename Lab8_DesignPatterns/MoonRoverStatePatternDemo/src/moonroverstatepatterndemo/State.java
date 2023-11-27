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
    public String pressLeftPedalOnce(Context buggyContext);
    public String pressLeftPedalFor3Sec(Context buggyContext);
    public String pressRightPedalOnce(Context buggyContext);    
    public String pressRightPedalFor3Sec(Context buggyContext);
    
}

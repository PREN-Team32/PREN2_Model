/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;

/**
 *
 * Wrapperclass used to store and transmit the results of the object detector
 * @author Niklaus
 */
public class ValueItem {
    public File originalImage;
    public File editedImage;
    
    public int mainArea;
    public int totalTimeUsed;
    public boolean foundShape;
    public int calculatedAngle;
}

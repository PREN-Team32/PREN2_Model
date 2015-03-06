/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * Wrapperclass used to store and transmit the configuration details for the detector.
 * @author Nikk
 */
public class ConfigurationItem {
    public int luminanceThreshold;
    
    //Width & Height which will be analysed (Rest of Image will be cut off)
    public int withToObserve;
    public int heightToObserve;
    
    //Amount of visited adjacent Pixels to determine a shape.
    public int visitedPixels;
    
    //Boolean flag to indicate start
    public boolean startSignal;
}  

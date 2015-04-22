/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp.conversion;

/**
 *
 * @author Alex
 */
public class FahrenheitToCelsiusStrategy implements TempConverter{

    public FahrenheitToCelsiusStrategy() {
        
    }
    @Override
    public double getConverted(double degrees) {

        return ((degrees-32)*(.555));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rd.temp.converter;

import temp.conversion.CelciusToFahrenheitStrategy;
import temp.conversion.DegreeType;
import temp.conversion.FahrenheitToCelsiusStrategy;
import temp.conversion.NoConversionStrategy;
import temp.conversion.TempConverter;
import static temp.conversion.DegreeType.CELSIUS;
import static temp.conversion.DegreeType.FAHRENHEIT;



/**
 *
 * @author Alex
 */


public class TempConversionService {
    TempConverter tempConverter;
    private DegreeType first, second;

    public TempConversionService() {
    }
    

    public void setTempConverter(){
    
        if(first.equals(CELSIUS) && second.equals(FAHRENHEIT)){
        tempConverter = new CelciusToFahrenheitStrategy();
        } else if(first.equals(FAHRENHEIT) && second.equals(CELSIUS)){
        tempConverter = new FahrenheitToCelsiusStrategy();
        } else if(first.equals(second)){
        tempConverter = new NoConversionStrategy();
        }
    
    }

    public void setFirst(DegreeType first) {
        this.first = first;
    }

    public void setSecond(DegreeType second) {
        this.second = second;
    }
    
    public double getConversion(double degrees){
    return tempConverter.getConverted(degrees);
    }


    
    
}

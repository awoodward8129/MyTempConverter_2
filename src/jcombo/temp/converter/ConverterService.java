/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcombo.temp.converter;

import java.util.Objects;
import temp.conversion.TempConverter;

/**
 *
 * @author Alex
 */
public class ConverterService {

    TempConverter tempConverter;
    private String conversion;
    private double degree;

    public ConverterService(String conversion, TempConverter tempConverter) {
        this.conversion = conversion;
        this.tempConverter = tempConverter;

    }

    public void setTempConverter(TempConverter tempConverter) {
        this.tempConverter = tempConverter;

    }

    public void setDegrees(double degree) {
        this.degree = degree;

    }

    public double getConverted() {

        return tempConverter.getConverted(degree);

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.conversion);

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ConverterService other = (ConverterService) obj;
        if (!Objects.equals(this.conversion, other.conversion)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return conversion;
    }

}

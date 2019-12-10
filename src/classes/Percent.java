/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IPercent;;

/**
 *
 * @author Nicolas
 */
public class Percent implements IPercent{
    private final Double value;

    public Percent(Double value) {
        this.value = value;
    }
   
    @Override
    public IPercent getPercent() {
        return new Percent(this.value);
    }

    @Override
    public Double getFrational() {
        return this.value/100.0;
    }

    @Override
    public Double get() {
        return this.value;
    }

    @Override
    public IPercent valueOf(double value) {
        return new Percent(value);
    }

    @Override
    public Double apply(Double value) {
        return value * this.getFrational();
    }
    
}

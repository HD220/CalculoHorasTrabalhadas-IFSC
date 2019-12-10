/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IHourRevenue;

/**
 *
 * @author Nicolas
 */
public class HourRevenue implements IHourRevenue{

    private final Double value;
    
    public HourRevenue(Double value){
        this.value = value;
    }
    
    @Override
    public Double get() {
        return this.value;
    }

    @Override
    public IHourRevenue valueOf(double value) {
        return new HourRevenue(value);
    }
    
}

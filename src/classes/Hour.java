/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IHour;

/**
 *
 * @author Nicolas
 */
public class Hour implements IHour{

    private final Double value;

    public Hour(Double baseHour) {
        this.value = baseHour;
    }

    @Override
    public Double get() {
        return this.value;
    }
    
}

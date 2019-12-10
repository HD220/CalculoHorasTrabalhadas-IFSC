/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.ICurrency;

/**
 *
 * @author Nicolas
 */
public class Currency implements ICurrency{
    protected final Double value;
    
    public Currency(Double value){
        this.value = value;
    }
    
    @Override
    public Double get() {
        return value;
    }
    
}

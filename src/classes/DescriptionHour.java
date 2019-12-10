/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IDescriptionHour;

/**
 *
 * @author Nicolas
 */
public class DescriptionHour implements IDescriptionHour{
    private final String value;
    
    public DescriptionHour(){
        this.value = "";
    }
    
    public DescriptionHour(String value){
        this.value = value;
    }
    
    public DescriptionHour(String text, String[] args){
        this.value = String.format(text, (Object[]) args);
    }
    
    @Override
    public String get() {
        return this.value;
    }
    
}

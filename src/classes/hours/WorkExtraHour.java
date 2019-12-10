/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.hours;

import classes.Currency;
import classes.Percent;
import interfaces.ICurrency;
import interfaces.IDescriptionHour;
import interfaces.IHour;
import interfaces.IHourRevenue;
import interfaces.IPercent;
import interfaces.IWorkHour;

/**
 *
 * @author Nicolas
 */
public class WorkExtraHour implements IWorkHour{

    private final IDescriptionHour description;
    private final IHour hours;
    private final IPercent percent;
    private final IHourRevenue hourBaseRevenue;
    private final IHourRevenue hourRevenue;
    private final ICurrency totalRevenue;
    
    public WorkExtraHour(IDescriptionHour description, IHourRevenue hourBaseRevenue, IHour hours){
        this.description = description;
        this.hours = hours;
        this.percent = new Percent(70.0);
        this.hourBaseRevenue = hourBaseRevenue;
        this.hourRevenue =  this.hourBaseRevenue.valueOf(this.percent.apply(hourBaseRevenue.get()));
        this.totalRevenue = new Currency(this.hours.get() * this.hourRevenue.get());        
    }
    
    @Override
    public IDescriptionHour description() {
        return description;
    }

    @Override
    public IHourRevenue baseHourRevenue() {
        return hourBaseRevenue;
    }

    @Override
    public IHourRevenue hourRevenue() {
        return hourRevenue;
    }

    @Override
    public IHour hours() {
        return hours;
    }

    @Override
    public ICurrency totalRevenue() {
        return totalRevenue;
    }
    
}

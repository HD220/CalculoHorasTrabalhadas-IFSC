/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.salary;

import classes.Currency;
import classes.HourRevenue;
import interfaces.ISalaryCalculator;
import interfaces.ICurrency;
import interfaces.IHour;
import interfaces.IHourRevenue;
import interfaces.IWorkHour;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public class SalaryCalculator implements ISalaryCalculator{

    private final ICurrency baseSalary;
    private final IHour workload;
    private final List<IWorkHour> hoursList; 
    
    public SalaryCalculator(ICurrency baseSalary, IHour workload){
        this.baseSalary = baseSalary;
        this.workload = workload;
        this.hoursList = new ArrayList<>();
    }

    @Override
    public void addWorkedHours(IWorkHour workedhours) {
        this.hoursList.add(workedhours);
    }
    
    @Override
    public void rmvWorkedHours(IWorkHour workedhours) {
        this.hoursList.remove(workedhours);
    }

    @Override
    public IHourRevenue baseHourRevenue() {
        return new HourRevenue(baseSalary.get() / workload.get());
    }
    
    @Override
    public List<IWorkHour> hoursList(){
        return hoursList;
    }

    @Override
    public ICurrency totalRevenue() {
        Double total;
        total = hoursList.stream().mapToDouble((item)->item.totalRevenue().get()).sum();
        return new Currency(total);
    }

    @Override
    public ICurrency baseSalary() {
        return this.baseSalary;
    }

    @Override
    public IHour workload() {
        return this.workload;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.salary;

import interfaces.ISalaryCalculator;
import interfaces.ISalaryPrintable;
import interfaces.IWorkHour;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public class SalaryPrintable implements ISalaryPrintable{

    private final String baseSalary;
    private final String totalRevenue;
    private final List<IWorkHour> hourList;

    //private final ISalaryCalculator calc;
    
    public SalaryPrintable(ISalaryCalculator calc){
        this.baseSalary = String.format("%20s: %10.2fh = R$ %10.2f", "Salário Base", calc.workload().get(),calc.baseSalary().get());
        this.totalRevenue = String.format("%20s:%15sR$ %10.2f","Total Liquido", "",calc.totalRevenue().get());
        this.hourList = calc.hoursList();
    }
    
    @Override
    public String printHour(IWorkHour wh){
        return String.format("%20s: %10.2fh = R$ %10.2f", wh.description().get(), wh.hours().get(), wh.totalRevenue().get());
    }
    
    @Override
    public void print() {
        System.out.println(baseSalary);
        for(IWorkHour wh : hourList){
            System.out.println(printHour(wh));
        }
        System.out.println(totalRevenue);
    }
    
}

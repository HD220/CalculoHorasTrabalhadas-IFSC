/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author Nicolas
 */
public interface ISalaryCalculator {
    public ICurrency baseSalary();
    public IHour workload();
    public IHourRevenue baseHourRevenue();
    public void addWorkedHours(IWorkHour workedhours);
    public void rmvWorkedHours(IWorkHour workedhours);
    public List<IWorkHour> hoursList();
    public ICurrency totalRevenue();
    
}

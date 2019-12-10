package trabalho;

import classes.Currency;
import classes.DescriptionHour;
import classes.salary.SalaryCalculator;
import interfaces.ISalaryCalculator;
import classes.Hour;
import classes.hours.WorkExtraHour;
import classes.hours.WorkHolidayHour;
import classes.hours.WorkNightHour;
import classes.hours.WorkNormalHour;
import classes.salary.SalaryPrintable;
import interfaces.IHourRevenue;
import interfaces.IPrintable;
import interfaces.IWorkHour;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public class Main {
    public static void main(String[] args) {
        ISalaryCalculator calc = new SalaryCalculator(new Currency(3500.0), new Hour(220.0));
        IHourRevenue baseRevenue = calc.baseHourRevenue();
        
        IWorkHour horaNormal = new WorkNormalHour(new DescriptionHour("Hora Normal"), baseRevenue, new Hour(196.0));
        IWorkHour horaExtra = new WorkExtraHour(new DescriptionHour("Hora Extra"), baseRevenue, new Hour(15.0));
        IWorkHour horaExtraFeriado = new WorkHolidayHour(new DescriptionHour("Hora Domingo/Feriado"), baseRevenue, new Hour(5.0));
        IWorkHour horaNoturna = new WorkNightHour(new DescriptionHour("Hora Noturna"), baseRevenue, new Hour(2.0));
        
        calc.addWorkedHours(horaNormal);
        calc.addWorkedHours(horaExtra);
        calc.addWorkedHours(horaExtraFeriado);
        calc.addWorkedHours(horaNoturna);
        
        IPrintable calcPrint = new SalaryPrintable(calc);
        calcPrint.print();
    }
}

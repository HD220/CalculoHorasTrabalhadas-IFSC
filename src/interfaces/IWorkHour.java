/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Nicolas
 */
public interface IWorkHour {
    
    /**
     *
     * @return DescriptionHour with description this hour
     */
    public IDescriptionHour description();
    
    /**
     *
     * @return HourRevenue with base value hour
     */
    public IHourRevenue baseHourRevenue();
    
    /**
     *
     * @return HourRevenue with final value hour
     */
    public IHourRevenue hourRevenue();
    
    /**
     *
     * @return Hour with hours reference
     */
    public IHour hours();
    
    /**
     *
     * @return BrazilCurrency with total value worked hours
     */
    public ICurrency totalRevenue();
}

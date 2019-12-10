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
public interface IPercent extends ITyneType<Double>{
    public IPercent getPercent();
    public Double getFrational();
    public Double apply(Double value);
    public IPercent valueOf(double value);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratordesignpattern;

/**
 *
 * @author tmt
 */
public class MilitaryCar extends CarDecorator{
    
    public MilitaryCar(ICar car)
    {
        super(car);
    }
    
    public void drive()
    {
        tempCar.drive();
        System.out.println(" Military Car is hitting");
    }
}

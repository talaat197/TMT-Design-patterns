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
public class SportCar extends CarDecorator{
    
    public SportCar(ICar car)
    {
        super(car);
    }
    
    @Override
    public void drive()
    {
        tempCar.drive();
        System.out.println(" Sport Car Moving");
    }
}

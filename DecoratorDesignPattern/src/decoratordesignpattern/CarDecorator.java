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
abstract class CarDecorator implements ICar{
    protected ICar tempCar;
    
    public CarDecorator(ICar car)
    {
        this.tempCar = car;
    }
    
    @Override
    public void drive()
    {
        tempCar.drive();
    }
}

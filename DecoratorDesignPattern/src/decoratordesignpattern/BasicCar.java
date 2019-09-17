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
public class BasicCar implements ICar {

    @Override
    public void drive() {
        System.out.println("Car is moving");
    }
    
}

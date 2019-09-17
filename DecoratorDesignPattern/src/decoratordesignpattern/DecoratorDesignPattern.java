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
public class DecoratorDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICar car = new SportCar(new MilitaryCar(
                new BasicCar()
        ));
        car.drive();
        
    }
    
}

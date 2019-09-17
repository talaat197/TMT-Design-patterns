/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorymethod;

/**
 *
 * @author tmt
 */
public class FactoryMethodMain {
    
    public static void main(String args[])
    {
        IDog dog = DogFactory.createDog("fast");
        dog.run();
        
        dog = DogFactory.createDog("slow");
        dog.run();
    }
}

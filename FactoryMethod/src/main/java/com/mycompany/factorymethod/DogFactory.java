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
public class DogFactory {
    
    public static IDog createDog(String type)
    {
        IDog dog = null;
        switch(type)
        {
            case "fast":
                dog = new German();
                break;
            case "slow":
                dog = new Rotwiller();
        }
        
        return dog;
    }
}

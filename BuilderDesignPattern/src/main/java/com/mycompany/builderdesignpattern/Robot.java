/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.builderdesignpattern;

/**
 *
 * @author tmt
 */
public class Robot implements RobotCreationPlan{
    private String head;
    private String body;
    private String feet;

    @Override
    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public void setBody(String body) {
        this.body= body;
    }

    @Override
    public void setFeet(String feet) {
        this.feet = feet;
    }
    
    public void run()
    {
        System.out.println("My body is "+this.body + " \nMy Mind is "+this.head + " \nMy feet is "+this.feet);
    }
}

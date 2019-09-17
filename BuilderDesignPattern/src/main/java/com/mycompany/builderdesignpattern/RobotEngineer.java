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
public class RobotEngineer {
    private RobotBuilder builder;
    
    public RobotEngineer(RobotBuilder builder)
    {
        this.builder = builder;
    }
    
    public Robot getRobot()
    {
        return builder.getRobot();
    }
    
    public RobotEngineer build()
    {
        builder.buildHead();
        builder.buildBody();
        builder.buildFeet();
        
        return this;
    }
}

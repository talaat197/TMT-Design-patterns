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
public class RobotMain {
    
    public static void main(String args[])
    {
        RobotEngineer engineer = new RobotEngineer(new StandardRobotBuilder());
        
        Robot robot = engineer.build().getRobot();
        
        robot.run();
        
        engineer = new RobotEngineer(new ModernRobotBuilder());
        
        robot = engineer.build().getRobot();
        
        robot.run();
    }
}

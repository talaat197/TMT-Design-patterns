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
public class ModernRobotBuilder implements RobotBuilder{
    Robot robot;
    
    public ModernRobotBuilder()
    {
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        this.robot.setHead("Modern head 120% working");
    }

    @Override
    public void buildBody() {
        this.robot.setBody("modern body 7020 Metal");
    }

    @Override
    public void buildFeet() {
        this.robot.setFeet("74% Metal feet");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
    
}

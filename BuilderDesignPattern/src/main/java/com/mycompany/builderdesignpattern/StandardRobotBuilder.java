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
public class StandardRobotBuilder implements RobotBuilder{

    Robot robot;
    
    public StandardRobotBuilder()
    {
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        this.robot.setHead("Standard head 20% working");
    }

    @Override
    public void buildBody() {
        this.robot.setBody("standard body 132 Metal");
    }

    @Override
    public void buildFeet() {
        this.robot.setFeet("40% Metal feet");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
    
}

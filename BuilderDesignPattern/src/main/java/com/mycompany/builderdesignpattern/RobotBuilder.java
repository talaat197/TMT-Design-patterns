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
public interface RobotBuilder {
    
    public void buildHead();
    public void buildBody();
    public void buildFeet();
    public Robot getRobot();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanylare.abstractfactory;

/**
 *
 * @author tmt
 */
public class WINFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public SelectBox createSelectBox() {
        return new WinSelectBox();
    }
    
}

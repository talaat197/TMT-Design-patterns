/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanylare.bridge;

/**
 *
 * @author tmt
 */
public abstract class Page {
    Renderer renderer;
    public Page(Renderer renderer)
    {
        this.renderer = renderer;
    }
    
    public void changeRenderer(Renderer renderer)
    {
        this.renderer = renderer;
    }
    
    public abstract String view();
}

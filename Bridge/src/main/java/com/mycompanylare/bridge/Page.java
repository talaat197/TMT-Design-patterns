/*
In this example, the Page hierarchy acts as the Abstraction, 
and the Renderer hierarchy acts as the Implementation. 
Objects of the Page class can assemble web pages of a particular kind 
using basic elements provided by a Renderer object attached to that page. Since both of the class hierarchies are separate, 
you can add a new Renderer class without changing any of the Page classes and vice versa.
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

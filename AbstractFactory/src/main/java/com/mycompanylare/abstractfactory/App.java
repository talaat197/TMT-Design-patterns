/**
 * illustrates how the Abstract Factory pattern 
 * can be used for creating cross-platform UI elements without coupling 
 * the client code to concrete UI classes, while keeping all 
 * created elements consistent with a selected operating system.
 */
package com.mycompanylare.abstractfactory;

/**
 *
 * @author tmt
 */
public class App {
    public static void main(String args[])
    {
        Button btn;
        SelectBox selectbox;
        
        // depend  on configuration we will create WIN GUI
        GUIFactory factory = new WINFactory();
        
        selectbox = factory.createSelectBox();
        btn = factory.createButton();
        
        selectbox.draw();
        btn.draw();
        
        // ops configuration changes we want to change it to Linux !
        factory = new LinuxFactory();
        
        selectbox = factory.createSelectBox();
        btn = factory.createButton();
        
        selectbox.draw();
        btn.draw();
        
        
    }
}

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
public interface Renderer {
    
    public String renderTitle(String title);
    
    public String renderTextBlock(String textBlock);
    
    public String renderImage(String imagePath);
    
    public String renderLink(String link , String text);
    
    public String renderHeader();
    
    public String renderFooter();
    
    /**
     * render all the the parts passing to him
     * @param parts
     * @return 
     */
    public String renderParts(String[] parts);
}
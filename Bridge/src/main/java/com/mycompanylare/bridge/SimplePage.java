/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanylare.bridge;

/**
 *This Concrete Abstraction represents a simple page.
 * @author tmt
 */
public class SimplePage extends Page{
    String title , content;
    public SimplePage(Renderer renderer , String title , String content)
    {
        super(renderer);
        this.title = title;
        this.content = content;
    }

    @Override
    public String view() {
        String[] parts = {
            renderer.renderHeader() ,
            renderer.renderTextBlock(title),
            renderer.renderFooter()
        };
        return renderer.renderParts(parts);
    }
    
}

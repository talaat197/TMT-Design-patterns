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
public class HtmlRenderer implements Renderer{

    @Override
    public String renderTitle(String title) {
        return "<h1 class='title'>"+title+"<h1>";
    }

    @Override
    public String renderTextBlock(String textBlock) {
        return "<p class='text'>"+textBlock+"<p>";
    }

    @Override
    public String renderImage(String imagePath) {
        return "<img width='100%' src='"+imagePath+"'/>";
    }

    @Override
    public String renderLink(String link , String text) {
        return "<a class='btn btn-primary' href='"+link+"'>"+text+"<a>";
    }

    @Override
    public String renderHeader() {
        return "<html><head></head><body>";

    }

    @Override
    public String renderFooter() {
        return "</body></html>";
    }

    @Override
    public String renderParts(String[] parts) {
        return String.join("\n", parts);
    }
    
}

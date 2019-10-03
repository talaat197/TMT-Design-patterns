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
public class JsonRenderer implements Renderer{
    @Override
    public String renderTitle(String title) {
        return "title:'"+title+"'";
    }

    @Override
    public String renderTextBlock(String textBlock) {
        return "text:'"+textBlock+"'";
    }

    @Override
    public String renderImage(String imagePath) {
        return "image:'"+imagePath+"'";
    }

    @Override
    public String renderLink(String link , String text) {
        return "link:{url:'"+link+"',text:'"+text+"'}";
    }

    @Override
    public String renderHeader() {
        return "header:''";
    }

    @Override
    public String renderFooter() {
        return "footer:''";
    }

    @Override
    public String renderParts(String[] parts) {
        return "{\n" + String.join(",", parts) + "\n}";
    }
}

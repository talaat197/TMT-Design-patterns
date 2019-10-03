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
public class ProductPage extends Page{
    Product product;
    public ProductPage(Renderer renderer , Product product)
    {
        super(renderer);
        this.product = product;
    }

    @Override
    public String view() {
        String[] parts = {
            renderer.renderHeader(),
            renderer.renderTitle(this.product.getTitle()),
            renderer.renderImage(this.product.getImage()),
            renderer.renderLink("www.tmt.products.com", this.product.getTitle()),
            renderer.renderTextBlock(this.product.getDescription()),
            renderer.renderFooter()
        };
        return this.renderer.renderParts(parts);
    }
    
}

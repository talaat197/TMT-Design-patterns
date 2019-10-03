/*
In this example, the Page hierarchy acts as the Abstraction,
and the Renderer hierarchy acts as the Implementation.
Objects of the Page class can assemble web pages of a particular kind 
using basic elements provided by a Renderer object attached to that page.
Since both of the class hierarchies are separate, 
you can add a new Renderer class without changing any of the Page classes and vice versa.
 */
package com.mycompanylare.bridge;

/**
 *
 * @author tmt
 */
public class Client {
    public static void main(String[] args)
    {
        Renderer htmlRenderer = new HtmlRenderer();
        Page simplePage = new SimplePage(htmlRenderer, "TMT SIMPLE", "TMT POWERFULL COMPANY");
        view(simplePage);
        
        Renderer jsonRenderer = new JsonRenderer();
        simplePage.changeRenderer(jsonRenderer);
        view(simplePage);
        // Product page
        Product x_phone = new Product("X-PHONE", "Most powerfull phone in the earth", "www.x-phone.com");
        Page prodcutPage = new ProductPage(htmlRenderer, x_phone);
        view(prodcutPage);
        
        prodcutPage.changeRenderer(jsonRenderer);
        view(prodcutPage);
        
    }
    /**
     * 
     * @param page 
     */
    public static void view(Page page)
    {
        System.out.println(page.view());
    }
}

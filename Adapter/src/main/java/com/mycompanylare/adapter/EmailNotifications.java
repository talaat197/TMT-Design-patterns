/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanylare.adapter;


/**
 *
 * @author tmt
 */
public class EmailNotifications implements Notificaitons{
    private String email = "";
    public EmailNotifications(String email) {
        this.email = email;
    }

    @Override
    public void send(String title, String message) {
        // email logic for sending email
        System.out.println("Sending To Email "+this.email+"\ntitle:"+title+"\nbody:"+message);
    }
    
}

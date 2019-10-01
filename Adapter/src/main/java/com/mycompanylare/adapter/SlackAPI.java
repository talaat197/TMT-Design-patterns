/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanylare.adapter;

/**
 * the service that we need to adapte with it
 * @author tmt
 */
public class SlackAPI {
    private String channel = "";
    private String api_key = "";
    
    public SlackAPI(String channel , String api_key)
    {
        this.channel = channel;
        this.api_key = api_key;
    }
    
    public void login()
    {
        System.out.println("Logged In to Channel "+this.channel);
    }
    
    public void sendMessage(String chat_id , String message)
    {
        System.out.println("Sending to Chat:"+chat_id+"\n"+message);
    }
}

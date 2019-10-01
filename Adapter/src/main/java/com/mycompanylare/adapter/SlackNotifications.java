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
public class SlackNotifications implements Notificaitons{
    private SlackAPI slack;
    private String chatId;
    
    public SlackNotifications(SlackAPI slack , String chatId)
    {
        this.slack = slack;
        this.chatId = chatId;
    }
    @Override
    public void send(String title, String message) {
        String slackMessage = "#"+title+"#"+message;
        this.slack.login();
        this.slack.sendMessage(this.chatId , slackMessage);
    }
    
}

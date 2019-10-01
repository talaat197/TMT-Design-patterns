/*
consider we have an email notification in the system 
now we need to add Slack Notification by interacting with the API
so we would use a wrapper for this service
*/
package com.mycompanylare.adapter;

/**
 *
 * @author tmt
 */
public class App {
    public static void main(String[] args)
    {
        Notificaitons emailNotification = new EmailNotifications("TMT@TMT.com");
        App.clientCode(emailNotification);
        
        SlackAPI slack = new SlackAPI("TMT-TECH" , "XXXX-TMT-XXX");
        
        Notificaitons slackNotification = new SlackNotifications(slack, "123002");
        App.clientCode(slackNotification);
    }
    
    public static void clientCode(Notificaitons notifications)
    {
        notifications.send("Tech issue", "TMT WEBSITE IS FACING PERFOMANCE ISSUE");
    }
    
}

package com.revature.spring.di;

public class NotificationService {

    private MessageService service;

    // Empty constructor for setter-based injection
    public NotificationService() {
    }

    // setter-based dependency injection
    public void setNotificationService(MessageService service) {
        this.service = service;
    }

    public void sendNotification() {
        System.out.println("Sending notification: " + service.getMessage());
    }
}

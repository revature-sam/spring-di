package com.revature.spring.di;
public class MessageService {
    private String message;

    // no-arg constructor for setter injection
    public MessageService() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println("Message: " + message);
    }
}

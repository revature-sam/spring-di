package com.revature.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // load the Spring configuration file
        ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve the beans from Spring container
        NotificationService service = context.getBean("notificationService", NotificationService.class);
        EmailService emailService = context.getBean("emailService", EmailService.class);
        SMSService smsService = context.getBean("smsService", SMSService.class);

        // use the bean
        service.setNotificationService(emailService);
        service.sendNotification();
        service.setNotificationService(smsService);
        service.sendNotification();

        // close the context
        ((ConfigurableApplicationContext) context).close(); 
    }
}

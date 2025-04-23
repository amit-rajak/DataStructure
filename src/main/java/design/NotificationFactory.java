package design;

import java.util.Optional;

public class NotificationFactory {


    public Optional<Notification> createNotification(String str){

        Notification notification = null;
        if(str.equalsIgnoreCase("SMS")){
            notification=new SMSNotification();
        }

       else if(str.equalsIgnoreCase("PUSH")){
            notification= new PushNotification();
        }
       else if(str.equalsIgnoreCase("EMAIL")){
            notification= new EmailNotification();
        }

        return Optional.ofNullable(notification);
    }

}

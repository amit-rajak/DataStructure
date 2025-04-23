package CreationalDesignPattren.Factory.problem1;

import java.util.Optional;

public class NotificationFcatory {

    public Optional <Notification> CreateNotification(String str){
        Notification notification = null;

        if(str.equalsIgnoreCase("SMS")){
           notification =  new SMSNotificaton();

        } else if (str.equalsIgnoreCase("EMAIL")) {

            notification = new EmailNotification();

        } else if (str.equalsIgnoreCase("PUSH")) {

            notification = new PUSHNOtification();

        }
        return Optional.ofNullable(notification);
    }

}

package design;

import org.springframework.boot.origin.SystemEnvironmentOrigin;

import java.util.Optional;

public class MainNotify {


    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Optional <Notification> notification=notificationFactory.createNotification("text");
        Optional <Notification>  pushNotification=notificationFactory.createNotification("PUSH");
        // Notification emailNotification=notificationFactory.createNotification("EMAIL");

      if(notification.isPresent()){
          notification.get().notifyChannel();
      }
      else {
          System.out.println("Notification Channel Not Found");
      }

        if(pushNotification.isPresent()){
            pushNotification.get().notifyChannel();
        }
        else {
            System.out.println("Notification Channel Not Found");
        }


    }

}
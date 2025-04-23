package CreationalDesignPattren.Factory.problem1;

import java.util.Optional;

public class Client {

    public static void main(String[] args) {

        NotificationFcatory  notificationFcatory = new NotificationFcatory();
        Optional<Notification> notification=  notificationFcatory.CreateNotification("SMS");
        Notification notification1=  notificationFcatory.CreateNotification("SMS").orElseThrow(()-> new RuntimeException(" not found"));

        // Safe access using Optional
        notification.ifPresent(Notification::notifyChannel);  // 1 type
        notification.get().notifyChannel();                   // type  2
        notification1.notifyChannel();  // Only runs if present  // type 3



    }
}

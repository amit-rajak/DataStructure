package design;

public class PushNotification implements Notification{
    @Override
    public void notifyChannel() {
        System.out.println("Push Notification");
    }
}

package design;

public class SMSNotification implements Notification {


    @Override
    public void notifyChannel() {
        System.out.println("SMS Notification");
    }
}

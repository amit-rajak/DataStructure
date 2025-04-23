package design;

public class EmailNotification implements  Notification {
    @Override
    public void notifyChannel() {

        System.out.println("Email");

    }
}

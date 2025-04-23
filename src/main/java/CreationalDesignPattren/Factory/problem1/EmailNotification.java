package CreationalDesignPattren.Factory.problem1;

public class EmailNotification implements Notification {
    @Override
    public void notifyChannel() {
        System.out.println("Email Notification");
    }
}

package CreationalDesignPattren.Factory.problem1;

public class SMSNotificaton implements  Notification {


    @Override
    public void notifyChannel() {
        System.out.println("SMS notification");
    }
}

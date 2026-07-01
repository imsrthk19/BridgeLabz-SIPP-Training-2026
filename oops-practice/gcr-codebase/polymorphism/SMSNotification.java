public class SMSNotification extends Notification {

    protected SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to: " + recipientName);
        System.out.println("Message: " + message);
        System.out.println("-----------------------------------");
    }
}
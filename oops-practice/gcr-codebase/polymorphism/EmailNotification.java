public class EmailNotification extends Notification {

    protected EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to: " + recipientName);
        System.out.println("Message: " + message);
    }
}
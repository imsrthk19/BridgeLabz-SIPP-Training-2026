public class NotificationMain {
    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Sarthak", "Welcome to our service!"),
                new SMSNotification("Rahul", "Your OTP is 123456"),
                new PushNotification("Priya", "You have a new message"),
                new EmailNotification("Aman", "Your account has been created")
        };

        System.out.println("----- Sending Notifications -----\n");

        for (Notification n : notifications) {
            n.sendNotification();
        }

        System.out.println("All notifications have been sent successfully.");
    }
}
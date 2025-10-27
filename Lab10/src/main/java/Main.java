
import Notification.NotificationChannel;
import Notificationfac.NotificationFactory;

public class Main {

	public static void main(String[] args) {
		NotificationChannel[] a = new NotificationChannel[] {
				NotificationFactory.createNotification("email", "e-message a", "Email@1"),
				NotificationFactory.createNotification("email", "e-message b", "Email@2"),
				NotificationFactory.createNotification("SMS", "SMS-message a", "nb1"),
				NotificationFactory.createNotification("SMS", "e-message a", "nb2"),
		};
		
		for(NotificationChannel n : a) {
			n.sendNotification();
		}
	}
}

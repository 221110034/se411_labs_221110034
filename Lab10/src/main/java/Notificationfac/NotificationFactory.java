package Notificationfac;

import Email.EmailChannel;
import Notification.NotificationChannel;
import SMS.SMSChannel;

public class NotificationFactory {
	public static NotificationChannel createNotification(String type, String message, String reciver) {
		switch (type) {
		case "email": return new EmailChannel(message, reciver);
		case "SMS": return new SMSChannel(message, reciver);
		default: return null;
		}
	}
}

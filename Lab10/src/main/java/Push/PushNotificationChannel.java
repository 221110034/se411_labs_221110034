package Push;

import Notification.NotificationChannel;

public class PushNotificationChannel extends NotificationChannel {

	
	public PushNotificationChannel(String m) {
		super(m);
	}

	@Override
	public void sendNotification(){
		System.out.print("Push Message: "+ this.getMessage());
	}
	
}

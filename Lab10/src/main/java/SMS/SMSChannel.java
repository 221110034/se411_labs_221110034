package SMS;

import Notification.NotificationChannel;

public class SMSChannel extends NotificationChannel {
	String phone_nb;
	
	public SMSChannel(String m, String nb) {
		super(m);
		this.phone_nb=nb;
	}

	@Override
	public void sendNotification(){
		System.out.print("SMS Message: "+ this.getMessage() + "\n");
	}
	
}

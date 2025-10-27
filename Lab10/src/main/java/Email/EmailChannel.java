package Email;

import Notification.NotificationChannel;

public class EmailChannel extends NotificationChannel {
	
	private String reciverEmail;
	
	public EmailChannel(String m, String email) {
		super(m);
		this.reciverEmail= email;
	}

	@Override
	public void sendNotification() {
		System.out.print("Sending email message:  "+ this.getMessage()+ "to" + this.reciverEmail + "\n");
		
	}


}

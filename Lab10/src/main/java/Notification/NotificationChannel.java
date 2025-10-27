package Notification;

public abstract class NotificationChannel {
	
	String message;
	public NotificationChannel(String m){
		this.message=m;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public abstract void sendNotification();
}

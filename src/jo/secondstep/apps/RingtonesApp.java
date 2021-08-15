package jo.secondstep.apps;

import jo.secondstep.osmanagers.NotificationManager;

public class RingtonesApp {
	
	public static void main(String[] args) {

		NotificationManager notificationManager = NotificationManager.getInstance();

		notificationManager.setDefaultRingtone("/download/ring_1");
		
		//System.out.println(notificationManager);
	}

}

package jo.secondstep.apps;

import jo.secondstep.osmanagers.NotificationManager;

public class SettingsApp {

	public static void main(String[] args) {

		NotificationManager notificationManager = NotificationManager.getInstance();

		notificationManager.setRingtoneVolume(45);
		
		System.out.println("After change volume:");
		System.out.println(notificationManager);

		RingtonesApp.main(args);
		
		System.out.println("\nAfter change default ringtone:");
		System.out.println(notificationManager);
	}

}

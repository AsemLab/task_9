package jo.secondstep.osmanagers;

public class NotificationManager {

	private String defaultRingtone;
	private boolean isVibrate;
	private int ringtoneVolume;

	private static NotificationManager instance;

	private NotificationManager() {
		defaultRingtone = "music/triangle.wav";
		isVibrate = true;
		ringtoneVolume = 75;
	}

	public static NotificationManager getInstance() {
		if (instance == null) {
			synchronized (NotificationManager.class) {
				if (instance == null) {
					instance = new NotificationManager();
				}
			}
		}

		return instance;
	}

	public String getDefaultRingtone() {
		return defaultRingtone;
	}

	public void setDefaultRingtone(String defaultRingtone) {
		this.defaultRingtone = defaultRingtone;
	}

	public boolean isVibrate() {
		return isVibrate;
	}

	public void setVibrate(boolean isVibrate) {
		this.isVibrate = isVibrate;
	}

	public int getRingtoneVolume() {
		return ringtoneVolume;
	}

	public void setRingtoneVolume(int ringtoneVolume) {
		this.ringtoneVolume = ringtoneVolume;
	}

	public static void setInstance(NotificationManager instance) {
		NotificationManager.instance = instance;
	}

	@Override
	public String toString() {
		return "NotificationManager [defaultRingtone=" + defaultRingtone + ", isVibrate=" + isVibrate
				+ ", ringtoneVolume=" + ringtoneVolume + "]";
	}

	
	
}

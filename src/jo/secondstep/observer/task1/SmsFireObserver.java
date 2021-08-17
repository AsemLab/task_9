package jo.secondstep.observer.task1;

public class SmsFireObserver {

	private String phoneNumber;
	
	public SmsFireObserver(String phoneNumber) {
	
		this.phoneNumber = phoneNumber;
	}
	
	public void sendSms() {
		System.out.println("Send sms to "+phoneNumber);
	}
}

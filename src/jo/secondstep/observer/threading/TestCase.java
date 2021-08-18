package jo.secondstep.observer.threading;

public class TestCase {

	public static void main(String[] args) {
		
		FireDepartment department = new FireDepartment();
		SMSNotification smsNotification = new SMSNotification();
		
		FireSensor fireSensor = new FireSensor("JUST university");
		
		fireSensor.register(department);
		fireSensor.register(smsNotification);
		fireSensor.register(department);
		fireSensor.register(smsNotification);
		fireSensor.register(department);
		fireSensor.register(smsNotification);

		fireSensor.detectFire();
		
		System.out.println("Test done");

	}

}

package jo.secondstep.observer.task1;

import java.util.Random;

public class Hotel {

	private static FireSensor fireSensor;

	public static void main(String[] args) {
		DepartmentFireObserver department = new DepartmentFireObserver();
		SmsFireObserver sms = new SmsFireObserver("0780073856");

		fireSensor = new FireSensor(department, sms);

		int fireProb = new Random().nextInt(100);

		if (fireProb >= 75) {
			fireSensor.notifyDepartment();
			fireSensor.notifyBySms();
		}
		else
			System.out.println("The hotel is safe");
	}
}

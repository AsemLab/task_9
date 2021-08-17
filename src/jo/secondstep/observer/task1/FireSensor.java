package jo.secondstep.observer.task1;

public class FireSensor {

	private DepartmentFireObserver departmentFireObserver;
	private SmsFireObserver smsFireObserver;
	
	public FireSensor(DepartmentFireObserver departmentFireObserver, SmsFireObserver smsFireObserver) {
	
		this.departmentFireObserver = departmentFireObserver;
		this.smsFireObserver = smsFireObserver;
	}
	
	public void notifyDepartment() {
		departmentFireObserver.callingDepartment();
	}
	
	public void notifyBySms() {
		smsFireObserver.sendSms();
	}
	
}

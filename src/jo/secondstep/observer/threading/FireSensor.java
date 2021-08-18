package jo.secondstep.observer.threading;
import java.util.*;

public class FireSensor {

	private String location;
	
	private List<FireSensorObserver> observers;
	
	public FireSensor(String location) {
		this.location = location;
		observers = new ArrayList<>();
	}

	public String getLocation() {
		return location;
	}
	
	public void register(FireSensorObserver fireSensorObserver) {
		observers.add(fireSensorObserver);
	}
	
	public void unregister(FireSensorObserver fireSensorObserver) {
		observers.remove(fireSensorObserver);
	}
	
	public void detectFire() {
		for(FireSensorObserver o: observers) {
			o.fireDetected(this);
		}
	}
	
}

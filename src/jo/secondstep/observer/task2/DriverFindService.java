package jo.secondstep.observer.task2;

public class DriverFindService implements OrderObserver {

	@Override
	public void startService(Order order) {
		System.out.println("Search for a diver for order: "+order.getId());

	}

}

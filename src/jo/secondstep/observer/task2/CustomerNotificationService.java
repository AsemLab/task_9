package jo.secondstep.observer.task2;

public class CustomerNotificationService implements OrderObserver {

	@Override
	public void startService(Order order) {
		System.out.println("Send app notification to customer: "+order.getCustomerId());

	}

}

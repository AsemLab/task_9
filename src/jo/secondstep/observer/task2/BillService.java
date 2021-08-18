package jo.secondstep.observer.task2;

public class BillService implements OrderObserver {

	@Override
	public void startService(Order order) {
		System.out.println("Send order bill to customer: "+order.getCustomerId()+" by email.");

	}

}

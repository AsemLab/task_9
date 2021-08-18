package jo.secondstep.observer.task2;

public class PaymentService implements OrderObserver {

	@Override
	public void startService(Order order) {
		System.out.println("Online payment for the order bill:"+order.getTotalBill()
		+" from customer: "+order.getCustomerId()+".");

	}

}

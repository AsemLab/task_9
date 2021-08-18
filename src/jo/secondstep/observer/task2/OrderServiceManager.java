package jo.secondstep.observer.task2;

import java.util.*;

public class OrderServiceManager {
	
	private List<OrderObserver> orderObservers;
	
	public OrderServiceManager() {
		orderObservers = new ArrayList<>();
	}

	public void registerObserver(OrderObserver observer) {
		orderObservers.add(observer);
	}
	
	public void unregisterObserver(OrderObserver observer) {
		orderObservers.remove(observer);
	}
	
	public void startServices(Order order) {
		
		for(OrderObserver o: orderObservers) {
			o.startService(order);
		}
		
		System.out.println("-------		-----------		---------\n");
	}
	
}

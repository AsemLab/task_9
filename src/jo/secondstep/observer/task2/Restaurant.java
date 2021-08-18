package jo.secondstep.observer.task2;

import java.util.*;

public class Restaurant {

	
	private String name;
	private List<Order> orders;
	
	public Restaurant(String name) {
		this.name = name;
		orders = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public boolean addOrder(Order order) {
		if(orders.size() < 10) {
			orders.add(order);
			return true;
		}else
			return false;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + "]";
	}
	
	
	
	
}

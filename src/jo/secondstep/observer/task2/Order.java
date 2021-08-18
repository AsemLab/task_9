package jo.secondstep.observer.task2;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private static int idGenerator = 0;

	private int id;
	private int customerId;
	private double totalBill;
	private List<String> items;

	public Order(int customerId, String... items) {
		id = ++idGenerator;
		this.customerId = customerId;
		totalBill = 10.75;
		this.items = new ArrayList<>();

		for (String s : items) {
			this.items.add(s);
		}
	}

	public int getId() {
		return id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public List<String> getItems() {
		return items;
	}

}

package jo.secondstep.observer.task2;

public class MainApp {

	private static OrderServiceManager orderManager = new OrderServiceManager();

	public static void main(String[] args) {

		registerServices();

		Restaurant r1 = new Restaurant("BurgerMax");
		Order o1 = new Order(123, "Burger 100gm", "Burger 160gm");

		order(r1, o1);

	}

	private static void order(Restaurant r, Order order) {
		if (r.addOrder(order))
			orderManager.startServices(order);
		else {
			System.out.println("Sorry, " + r.getName() + " is busy :(");
		}
	}

	private static void registerServices() {

		BillService billService = new BillService();
		DriverFindService driverFindService = new DriverFindService();
		CustomerNotificationService customerNotificationService = new CustomerNotificationService();
		PaymentService paymentService = new PaymentService();

		orderManager.registerObserver(billService);
		orderManager.registerObserver(driverFindService);
		orderManager.registerObserver(customerNotificationService);
		orderManager.registerObserver(paymentService);
	}

}

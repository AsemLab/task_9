package jo.secondstep.proxy;

public class OnlineShop {

	public static void main(String[] args) {
		ShippingService shippingService = ShippingManager.getShippingService();

		shippingService.ship("Asem Abu alrub, Irbid 21110, Jordan");
	}
}

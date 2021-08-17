package jo.secondstep.proxy;

public class OnlineShop {

	public static void main(String[] args) {
		ShippingService shippingService = ShippingManager.getShippingService("Jordan");

		shippingService.ship("Asem Abu alrub, Irbid 21110, Jordan");
		
		shippingService = ShippingManager.getShippingService("Ghana");
		shippingService.ship("Ghana Football Association, South East Ridge, Osu Link, PO Box 19338 Accra, Ghana");
	}
}

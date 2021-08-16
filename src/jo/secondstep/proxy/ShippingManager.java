package jo.secondstep.proxy;

public class ShippingManager {

	public static ShippingService getShippingService() {
		return new SippingServiceProxy(new DHL());
	}
}

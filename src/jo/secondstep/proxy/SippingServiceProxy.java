package jo.secondstep.proxy;

public class SippingServiceProxy implements ShippingService {

	private ShippingService realShippingService;

	public SippingServiceProxy(ShippingService realShippingService) {
		this.realShippingService = realShippingService;
	}

	@Override
	public void ship(String address) {
		realShippingService.ship(address);
	}

}

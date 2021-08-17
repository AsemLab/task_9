package jo.secondstep.proxy;

public class USShippingProxy implements ShippingService {

	private ShippingService realShippingService;

	public USShippingProxy(ShippingService realShippingService) {
		this.realShippingService = realShippingService;
	}

	@Override
	public void ship(String address) {
		realShippingService.ship(address);
	}

}

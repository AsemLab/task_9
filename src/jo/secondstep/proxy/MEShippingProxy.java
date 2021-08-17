package jo.secondstep.proxy;

public class MEShippingProxy implements ShippingService {

	private ShippingService realShippingService;

	public MEShippingProxy(ShippingService realShippingService) {
		this.realShippingService = realShippingService;
	}

	@Override
	public void ship(String address) {
		realShippingService.ship(address);
	}

}

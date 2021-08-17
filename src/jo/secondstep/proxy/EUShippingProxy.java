package jo.secondstep.proxy;

public class EUShippingProxy implements ShippingService {

	private ShippingService realShippingService;

	public EUShippingProxy(ShippingService realShippingService) {
		this.realShippingService = realShippingService;
	}

	@Override
	public void ship(String address) {
		realShippingService.ship(address);
	}

}

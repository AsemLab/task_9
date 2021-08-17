package jo.secondstep.proxy;

public class Aramex implements ShippingService {
	
	@Override
	public void ship(String address) {

		System.out.print("Ship to '");
		System.err.print(address);
		System.out.println("' by Aramex.");

	}

}

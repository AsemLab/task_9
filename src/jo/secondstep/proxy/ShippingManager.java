package jo.secondstep.proxy;

import java.util.ArrayList;
import java.util.List;

public class ShippingManager {

	private static List<String> euCountries;
	private static List<String> meCountries;
	private static List<String> usStates;

	static {
		euCountries = new ArrayList<>();
		meCountries = new ArrayList<>();
		usStates = new ArrayList<>();

		euCountries.add("France");
		euCountries.add("Germany");
		euCountries.add("Italy");
		euCountries.add("Spain");
		euCountries.add("UK");

		meCountries.add("Egypt");
		meCountries.add("Jordan");
		meCountries.add("Qatar");
		meCountries.add("Saudi Arabia");
		meCountries.add("UAE");

		usStates.add("California");
		usStates.add("Florida");
		usStates.add("New York");
		usStates.add("Texas");
		usStates.add("Washington");

	}

	public static ShippingService getShippingService(String country) {
		if(euCountries.contains(country))
			return new EUShippingProxy(new TNT());
		else if(meCountries.contains(country))
			return new MEShippingProxy(new Aramex());
		else if(usStates.contains(country))
			return new USShippingProxy(new DHL());
		
		else
			throw new RuntimeException("unfortunately "+country+" is not in our shipping range.");
	}
}

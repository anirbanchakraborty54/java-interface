package vehicles;

import specifications.FourWheeler;

public class Alto implements FourWheeler {

	

	public String getEngineCapacity() {
		return "800cc";
	}

	public String getColor() {
		return "Silver";
	}

	public String vehicleClass() {
		return "Hatchback";
	}
public static String getPrice() {
	return "300000";
}
}

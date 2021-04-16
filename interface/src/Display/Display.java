package Display;
import vehicles .Alto;
import vehicles.Scorpio;
public class Display {

	public static void main(String[] args) {
		
	 Alto alto = new Alto();
     Scorpio scorpio = new Scorpio();
     
     System.out.println("vehicleclass of alto = " +alto.vehicleClass());
     System.out.println("color of alto = " +alto.getColor());
     System.out.println("Engine capacity of alto = " +alto.getEngineCapacity());
     System.out.println("price of alto = " +Alto.getPrice());
     
     
     

     System.out.println("vehicleclass of scorpio = " +scorpio.vehicleClass());
     System.out.println("color of scorpio = " +scorpio.getColor());
     System.out.println("Engine capacity of scorpio = " +scorpio.getEngineCapacity());
     System.out.println("price of scorpio = " +Scorpio.getPrice());
     
	}

}

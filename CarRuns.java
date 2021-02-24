
package VehiclesAndCars;

/**
 *
 * @author ryangiles
 */
public class CarRuns {
    public static void main(String[] args){
     	Cars Subaru = new Cars("Subaru", "WRX", 2017, 2638);
	Cars Volk = new Cars("Volkswagon", "GTI", 2019, 2070);
	Cars Tesla = new Cars("Tesla", "Model X", 2021, 4500);
		
		Trip(Subaru);
		Trip(Volk);
		
                Trip(Tesla);
		
		PrintStatus(Subaru);
		PrintStatus(Volk);
		PrintStatus(Tesla);
		
		Subaru.Repair();
		PrintStatus(Subaru);
		System.out.println();
	}
	
	public static void Trip(Cars cars) {
		int trips = (int)(Math.random() * 40) + 80;
		for (int i = 0; i < trips; i++) {
			cars.isDriving();
			cars.isStopped();
		}
	}

      public static void PrintStatus(Vehicle vehicle) {
	String Maintain = "";
	String Alert = "";
	if (vehicle.needsMaintenance)
            Maintain += "needs maintenance";
	else 
            Maintain += " doesn't need maintenance";
	Alert = vehicle.getYear() + "" + vehicle.getMake() + ", " + vehicle.getModel() + " produced in " +  
		"weighing " + vehicle.getWeight() + " lbs. " + Maintain + " after " + vehicle.tripsSinceMaintenance + " miles.";
	System.out.println(Alert);
	}
}   


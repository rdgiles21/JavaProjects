package VehiclesAndCars;


public class Cars extends Vehicle {
    
 	private boolean isDriving = false;
	
	public Cars(String make, String model, int year, int weight){
		super(make, model, year, weight);
	}
	public void isDriving() {
		this.isDriving = true;
	}
	public void isStopped() {
		if (this.isDriving) {
			this.isDriving = false;
			this.tripsSinceMaintenance += 1;
		}
		if (this.tripsSinceMaintenance >= 100)
			this.needsMaintenance = true;
	}
	public boolean Driving() {
		return this.isDriving;
	}
}   

     
     
 
     
     
     
     
     
     
     
     
     
     
     
  
    
   
   
    


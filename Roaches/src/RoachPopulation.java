


public class RoachPopulation {
	
	private double population;
	
	
	public RoachPopulation(int number){
		population = number;
		}
	
	public void breed(){
		population = population * 2;
	}
	
	public void spray(double spraypct) {
		population = (population - (population * spraypct));
				
	}
	
	public double getRoaches() {
		return population;
	}
	
	

}

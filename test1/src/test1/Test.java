package test1;

public class Test {
	public static void main(String[] args){
	//Car c = new Car();
	//AutoBike a = new AutoBike();
	Honda h = new Honda();
	
	SonCar s = new SonCar();
	s.maxSpeed();
	DaughterCar d = new DaughterCar();
	d.maxSpeed();
	Car c = new SonCar();
	//´ÙÇü¼º
	c.maxSpeed();
	}
}

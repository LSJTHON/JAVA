package ch07.sec08.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Vehicle car = new Vehicle();
		driver.drive(car);
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		F1 f = new F1();
		driver.drive(f);
		
		driver.drive(new F1());
		
		driver.drive(new Mercedes());
	}

}

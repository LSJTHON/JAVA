package ch07.sec08.exam01;

public class TireExample {

	public static void main(String[] args) {
		Car c1 = new Car();
		
		
		c1.tire = new Tire();
		c1.run();
		
		c1.tire = new HankookTire();
		c1.run();
		
		c1.tire = new KumhoTire();
		c1.run();
		
	}

}

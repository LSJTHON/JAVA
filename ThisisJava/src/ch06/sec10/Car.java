package ch06.sec10;

public class Car {
	
	int speed;
	void run() {
		System.out.println("마하 "+speed+"으로 달립니다.");
	}
	static void simulate() {
		Car myCar = new Car();
		myCar.speed = 200;
		myCar.run();
	}
	public static void main(String[] args) {
		simulate();
		Car myCar2 = new Car();
		myCar2.speed = 60;
		myCar2.run();
	}
	

}

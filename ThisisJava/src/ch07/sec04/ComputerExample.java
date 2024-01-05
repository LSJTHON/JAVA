package ch07.sec04;

public class ComputerExample {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		Computer c2 = new Computer();
		
		System.out.println(c1.areaCircle(10));
		System.out.println(c2.areaCircle(10));
	}

}

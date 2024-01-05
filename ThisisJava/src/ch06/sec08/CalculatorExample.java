package ch06.sec08;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myarea = new Calculator();
		
		Calculator myarea2 = new Calculator();
	
		
		double result1 = myarea.areaRectangle(50);
		double result2 = myarea.areaRectangle(50, 30);
		
		System.out.println("정사각형: "+result1
				+"\n직사각형: "+result2);
		
	}
}
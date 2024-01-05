package ch06.sec10;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		System.out.println(result1);
		
		double result2  = Calculator.plus(10, 5);
		System.out.println(result2);
		
		double result3 = Calculator.minus(10, 5);
		System.out.println(result3);
	}
}

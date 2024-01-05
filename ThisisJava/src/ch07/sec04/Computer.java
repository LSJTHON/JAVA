package ch07.sec04;

public class Computer extends Calculator {

	@Override
	public double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle을 실행한것");
		return Math.PI*r*r;
	} //자식 클래스 부모는 Calculator
}

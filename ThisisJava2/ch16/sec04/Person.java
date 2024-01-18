package ch16.sec04;

public class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과: "+result); //리턴값이 있는 경우 담을 그릇(변수)이 필요하다.
	}
}

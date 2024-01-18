package ch16.sec04;

public class LambdaExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();

		person.action((x, y) -> {
			double result = x + y;
			return result;
		});
		person.action((x, y) -> (x + y)); // 이런 방식으로 리턴 생략가능

		person.action((x, y) -> sum(x, y));
	}
	public static double sum(double x, double y) {
		return (x+y);
	}

}

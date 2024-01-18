package ch16.sec01;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action((x, y) -> {
			int result = x + y;
			System.out.println("result : " + result);
		});

		action((x, y) -> {
			int result = x - y;
			System.out.println("result : " + result);
		});
	}

	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		calculable.Calculate(x, y);
	}

}

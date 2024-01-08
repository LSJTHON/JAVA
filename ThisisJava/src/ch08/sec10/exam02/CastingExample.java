package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle ve = new Bus();
		
		ve.run();
		
		Bus bus = (Bus)ve; // 인터페이스 변수를 구현객체로 강제변환 방법
		
		bus.run();
		bus.checkFare();
	}

}

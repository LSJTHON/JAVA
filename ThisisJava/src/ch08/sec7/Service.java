package ch08.sec7;

public interface Service {
	default void defaultMethod1() {
		System.out.println("default메소드 종속 코드");
		defaultCommon();
	}
	default void defaultMethod2() {
		System.out.println("default메소드 종속 코드");
		defaultCommon();
	}
	private void defaultCommon() { //같은 인터페이스 안에서만 실행 : 구현하는 객체 필요
		System.out.println("default메소드 중복 코드A");
		System.out.println("default메소드 중복 코드B");
	}
	
	static void staticMethod1() {
		System.out.println("static메소드1 종속코드");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("static메소드1 종속코드");
		staticCommon();
	}
	private static void staticCommon() {
		System.out.println("static메소드 중복 코드C");
		System.out.println("static메소드 중복 코드D");
	}
}

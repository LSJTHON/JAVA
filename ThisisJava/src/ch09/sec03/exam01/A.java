package ch09.sec03.exam01;

public class A {
	static class B{}
	B field = new B();
	
	
	//정적 필드 값으로 B 객체 대입
	static B field2 = new B();
	
	
	//A객체 생성자
	A(){
		B b = new B();
	}
	void method1() {
		B b = new B();
	}
	static void method2() {
		B b = new B();
	}
}

package ch09.sec05.exam01;

public class A {
	int field1;   //인스턴스 필드와 인스턴스메소드
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	//내부 클래스가 B인경우
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	static class C{
		void method() {
		field1 = 10;
		method1();
		
		field2 = 10;
		method2();
	}
	}
}
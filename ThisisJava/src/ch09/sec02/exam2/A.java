package ch09.sec02.exam2;

public class A {
	class B{
		int field1 =1;
		
		static int field2 = 2;
	
		B(){
			System.out.println("B생성자 실행");
		}
		
		void method1() {
			System.out.println("B-메소드1 실행");
		}
		static void method2() { //17버전 이상부터 가능함
			System.out.println("B 정적 메소드 2 실행");
		}
	}
	
	void useB() {
		B b = new B();
		
		System.out.println(b.field1);
		b.method1();
		System.out.println(B.field2);
		B.method2();
	}
}

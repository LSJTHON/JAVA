package ch09.sec04.exam02;

public class A {
	void useB() {
		class B{
			int field1 =1;
			
			static int field2 = 2;
			
			B(){
				System.out.println("B생성자 실행");
			}
			
			//인스턴스 메소드
			void method1() {
				System.out.println("B메소드1 실행");
			}
			
			static void method2() {
				System.out.println("B메소드2 실행");
			}
			//정적 메소드
			
		} // 로컬 클래스 useB메소드가 실행될때 클래스 B객체 생성 가능
		B b = new B();
		System.out.println(b.field1);
		
		System.out.println(B.field2);
		B.method2();
	}
}
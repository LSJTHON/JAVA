package ch09.sec04.exam03;

public class A {
	int var =1;
	
	public void method1(int arg) {
		int var = 1;
	//로컬 클래스 : 메소드가 실행할 동안 크랠스 생성 가능
		class B{
			void method2() {
				System.out.println("arg: "+arg);
				System.out.println("var: "+var);
				
				//arg = 2; 로컬 클래스 내에서는 값 수정 불가능함
				//var = 2;
			}
		}
		B b = new B();
		b.method2();
	}
}

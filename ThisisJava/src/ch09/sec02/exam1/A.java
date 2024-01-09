package ch09.sec02.exam1;

public class A {
	class B{  }//중첩 인스턴스 클래스
	B field = new B(); //인스턴스 B객체 생성
	
	//생성자
	A(){ B b = new B(); }
	
	void method() { B b = new B(); }
}

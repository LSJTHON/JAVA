package ch07.sec06.package1;

public class A {
	//필드선언
	protected String field;  //protected는 필드,생성자,메소드선언: 같은패키지+상속에서만 접근가능
	
	
	//생성자
	protected A() {
		
	}
	
	//메소드선언
	protected void method() {
		System.out.println("");
	}
}

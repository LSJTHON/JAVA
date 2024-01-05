package ch07.sec06.package2;

import ch07.sec06.package1.*;
//다른 패키지의 클래스를 상속 받으려면 import를 해주자
public class D extends A{
	public D() {
		super();
	}
	public void method1() {
		this.field = "value";
		this.method();
	}
	public void method2() {
		A a = new A();      //protected로 설정된 다른 패키지의 클래스에 상속을 받더라도 직접적인 객체 생성은 불가능하다. 
		a.field = "value";	//간접적으로만 이용가능
		a.method();
	}
}

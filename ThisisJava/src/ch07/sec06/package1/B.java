package ch07.sec06.package1;

public class B {
	public void method() { //같은 패키지 내에서 protected A클래스에 접근가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}

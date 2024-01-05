package ch07.sec06.package2;
import ch07.sec06.package1.*;
//일반적인 protected는 import 로는 다른 패키지로의 접근이 불가능하다.
public class C {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}

package ch06.exam03.package2;
import ch06.exam03.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1; //default 값은 접근 불가(같은 패키지 내에서만 가능함 import 하더라도 불가능
		a.field3 = 1; //private 값은 접근 불가( 같은 파일 내에서만 가능 import 하더라도 불가능
		
		
		a.method1();
		a.method2(); //default 값은 접근 불가(같은 패키지 내에서만 가능함 import 하더라도 불가능
		a.method3(); //private 값은 접근 불가(같은 파일 내에서만 가능 import 하더라도 불가능
	}
	
}

package ch06.exam03.package1;

public class B {
	public void method() {
		A a = new A();

		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1; //private는 같은 파일 내에서만 가능하므로 접근불가
		
		a.method1();
		a.method2();
		a.method3();  //private는 같은 파일 내에서만 가능하므로 접근불가
	}
}

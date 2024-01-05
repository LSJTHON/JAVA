package ch06.exam01.package1;

public class A { // default 상태 같은 패키지내에서만 접근가능
	A a1 = new A(true); // boolean
	A a2 = new A(1); // int
	A a3 = new A("문자열"); // String

	public A(boolean a) { //모든 패키지에서 접근 가능
		
	}

 	A(int a) { //같은 패키지 내에 접근 가능 (default)

	}

	private A(String a) { //같은 파일 내에 접근 가능

	}
}

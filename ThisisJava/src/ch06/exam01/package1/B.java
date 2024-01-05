package ch06.exam01.package1;

public class B {
	A a1 = new A(true); //boolean타입 public이라 접근 가능
	
	A a2 = new A(1); //int타입 default라 접근 가능(같은 패키지 내에 있기때문)
	
	A a3 = new A("Hello"); //String타입 접근 불가능(private는 같은 파일 내 메소드만 가능)
}

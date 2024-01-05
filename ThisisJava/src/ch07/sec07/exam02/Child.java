package ch07.sec07.exam02;

public class Child extends Parent{
	//부모 메소드2번을 오버라이딩하여 메소드 수정
	@Override
	public void method2() {
		System.out.println("자식 메소드 2번");
	}
	
	//자식 객체에 새로운 메소드를 추가
	public void method3() {
		System.out.println("자식 메소드 3번");
	}
	
}

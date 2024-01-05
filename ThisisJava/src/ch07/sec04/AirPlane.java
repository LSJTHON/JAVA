package ch07.sec04;

public class AirPlane {
	
	//부모 메소드 정의 이륙 착륙 비행
	public void land() {
		System.out.println("착륙합니다."); //부모 :일반 비행기
	}
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}

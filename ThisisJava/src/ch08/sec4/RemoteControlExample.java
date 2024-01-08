package ch08.sec4;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc; //인터페이스 변수 선언
		
		
		rc = new Television(); //RemoteControl이 television 클래스 접근
		rc.turnOn(); //RemoteControl에 있는 turnOn 메소드가 Television 클래스의 오버라이드된 turnOn에 접근
		rc.setVolume(5);
		rc.turnOff();
		
		
		rc = new Audio(); //RemoteControl이 audio 인터페이스 접근
		rc.turnOn();
		rc.setVolume(1465465650);
		rc.turnOff();
		
	}

}

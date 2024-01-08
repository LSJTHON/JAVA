package ch08.sec2;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
}

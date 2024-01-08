package ch08.sec5;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);

		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(150);
		
		rc.setMute(true);
		rc.setMute(false);
		RemoteControl.changeBattery(); //static 정적 메소드라 바로 호출
	}

}

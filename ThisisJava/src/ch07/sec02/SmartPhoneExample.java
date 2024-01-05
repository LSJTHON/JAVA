package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone iPhone11 = new SmartPhone("아이폰11","은색");
		
		System.out.println(iPhone11.model);
		System.out.println(iPhone11.color);
		
		System.out.println(iPhone11.wifi);
		iPhone11.bell();
		iPhone11.sendVoice("누구세요");
		iPhone11.receiveVoice("북한에서 온 김정은이다.");
		iPhone11.hangUp();
		
		
		iPhone11.setWifi(true);
		iPhone11.internet();
	}

}

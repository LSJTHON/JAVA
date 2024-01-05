package ch07.sec02;

public class SmartPhone extends Phone { //phone이 가진 기능에 추가적인 요소 추가 (상속을 이용해서 Phone기능도 가져오기)
	//phone필드+현재필드
	public boolean wifi;
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태변경");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
}

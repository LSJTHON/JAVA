package ch08.sec8;

public class SmartTelevision implements RemoteControl,Searchable{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("핵을 쏩니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("라고할뻔");
	}
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 호출합니다.");
	}
}

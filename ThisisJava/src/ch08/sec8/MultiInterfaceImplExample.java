package ch08.sec8;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new SmartTelevision();
	
		rc.turnOn();
		rc.turnOff();
		
		Searchable ser = new SmartTelevision();
		ser.search("김정은");
	}

}

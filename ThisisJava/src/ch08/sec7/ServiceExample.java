package ch08.sec7;

public class ServiceExample {

	public static void main(String[] args) {
		Service ser = new ServiceImpl();
		
		ser.defaultMethod1();
		System.out.println();
		
		ser.defaultMethod2();
		System.out.println();
		
		Service.staticMethod1();
		System.out.println();
		
		Service.staticMethod2();
		System.out.println();
	}

}

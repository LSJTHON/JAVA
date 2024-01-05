package ch06.sec10;

public class Korean {

	final String nation = "대한민국";
	final String ssn;
	
	
	String name;
	
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Korean k1 = new Korean("123456789-12345","이성종");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		k1.name = "박진호";
	}

}

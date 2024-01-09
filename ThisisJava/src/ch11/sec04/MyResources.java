package ch11.sec04;

public class MyResources implements AutoCloseable{
	private String name;

	public MyResources(String name) {
		this.name = name;
		System.out.println("MyResources "+name+" 열기");
	}
	public String read1() {
		System.out.println("MyResources "+name+" 읽기");
		return "100";
	}
	public String read2() {
		System.out.println("MyResources "+name+" 읽기");
		return "abc";
	}
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyResources "+name+" 닫기");
	}
	
	
}

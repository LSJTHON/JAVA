package ch07.sec03;

public class Phone {
	//필드선언
	public String model;
	public String color;
	
	public Phone(String model,String color) {
		this.model= model;
		this.color = color;
		System.out.println("Phone 생성자 실행");
	}
}

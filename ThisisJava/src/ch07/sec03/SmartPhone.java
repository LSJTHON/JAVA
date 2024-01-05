package ch07.sec03;

public class SmartPhone extends Phone{
	public SmartPhone(String model,String color) {
		super(model,color); 
		//this.model = model;
		//this.color = color;
		System.out.println("부모생성자 실행됨");
	}
}

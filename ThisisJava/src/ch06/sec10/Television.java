package ch06.sec10;

public class Television {
	static String company = "Mycompany";
	static String model = "LCD";
	static String info; //값을 company와 model을 합성해서 값을 넣겠다.
	
	static {
		info = company + "-" + model;
	}
}

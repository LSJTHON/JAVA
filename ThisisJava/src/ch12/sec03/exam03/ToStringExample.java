package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone p = new SmartPhone("MS","Window98");
		
		String strObj = p.toString();
		System.out.println(strObj);
		
		System.out.println(p);
	}

}

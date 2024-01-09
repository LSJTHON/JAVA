package ch11.sec02.exam01;

public class ExceptionHandleingExample1 {

	public static void printLength(String data) {
		int result = data.length();
		
		System.out.println("문자 수"+ result);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[프로그램 시작]\n");
		printLength("ThisisJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}

}

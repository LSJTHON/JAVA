package ch11.sec02.exam02;



public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("java.lang.String"); //ClassNotFoundException 발생 가능 코드
			System.out.println("java.lang.String 클래스가 존재합니다.");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		System.out.println();
		try {
			Class.forName("java.lang.String2"); //ClassNotFoundException 발생 가능 코드
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}

}

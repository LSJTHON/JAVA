package ch11.sec03.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"100","1oo"};
		
		for(int i = 0; i <=array.length;i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과 : "+e.getMessage());
			}catch(Exception e) {
				System.out.println("실행에 문제있음");
			}
		}
	}

}

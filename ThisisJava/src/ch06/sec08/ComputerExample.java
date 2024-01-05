package ch06.sec08;

public class ComputerExample {

	public static void main(String[] args) {
		Computer com = new Computer();
		
		int result1 = com.sum(1,2,3);
		System.out.println(result1);
		
		int result2 = com.sum(1,2,3,2,3,5,5,2,1,3,4,5,5,2,1,3,4,5,2,3,1,5,6);
		System.out.println(result2);
		
		int[] values = {1,2,3,4,5};
		
		int result3 = com.sum(values);
		System.out.println(result3);
		
		int result4 = com.sum(new int[] {1,2,3,4,5,6,7});
		System.out.println(result4);
	}
}

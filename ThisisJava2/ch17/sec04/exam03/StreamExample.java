package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
	
	public static int sum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream stream = IntStream.rangeClosed(1,100);
		stream.forEach(hello -> sum+= hello);
		System.out.println("총합: "+sum);
	}

}

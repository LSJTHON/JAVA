package ch17.sec04.exam02;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"홍길동","신용권","김미나"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item+", "));
		System.out.println();
		
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(idiot -> System.out.print(idiot+", "));
		System.out.println();
	}

}

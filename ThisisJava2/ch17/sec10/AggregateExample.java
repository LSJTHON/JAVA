package ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		long count = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.count();
		System.out.println("2의 배수의 개수 : "+count);
	
		long sum = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.sum();
		System.out.println("2의 배수의 합 : "+sum);
		
		
		double avg = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.average()
				.getAsDouble();
		System.out.println("2의 배수의 평균 : "+avg);
		
		
		int max = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.max()
				.getAsInt();
		System.out.println("2의 배수들의 최대값 : "+max);
		
		
		int min = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.min()
				.getAsInt();
		System.out.println("2의 배수들의 최소값 : "+min);
		
		
		int first = Arrays.stream(arr)
				.filter(n -> n%3==0)
				.findFirst()
				.getAsInt();
		System.out.println("첫 번째 3의 배수 : "+first);
	}
}

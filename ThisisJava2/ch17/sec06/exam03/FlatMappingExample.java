package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FlatMappingExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am a best developer");
		list1.stream()
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		list2.stream() 
			.flatMapToInt(data -> {
				
				String[] strArr = data.split(",");  // , 기준으로 분리  5개 나옴
				int[] intArr = new int[strArr.length]; // 5개
				 
				for(int i =0;i<strArr.length;i++) {  // 10 20 30 40 50 하나씩 int 형으로 바꾸고 집어넣기
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);		
			})
			.forEach(number -> System.out.println(number));
	}
}

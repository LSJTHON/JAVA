package ch17.sec05;

import java.util.ArrayList;
import java.util.List;


public class FilteringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김자바");
		list.add("신용권");
		list.add("신용권");
		list.add("신민철");
		
		list.stream()       //list를 스트림으로 만듦
			.distinct() //스트림 중복요소 제거
			.forEach(n -> System.out.println(n)); //스트림의 요소를 하나씩 가져와서 출력
		System.out.println();
		
		list.stream()
			.filter(n -> n.startsWith("신")) //요소의 시작값이 신 인것만 true 반환
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		list.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));
	}

}

package ch17.sec01.exam02;

import java.util.*;
import java.util.stream.Stream;
public class StraemExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("이성종");
		list.add("박진호");
		list.add("최종민");
		list.add("임성훈");
		list.add("전찬용");
		list.add("신종현");
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name -> {
			System.out.println(name +": "+Thread.currentThread().getName());
			
		});
	}

}

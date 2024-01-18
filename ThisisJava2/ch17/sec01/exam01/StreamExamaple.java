package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExamaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("마");
		set.add("가");
		set.add("나");
		set.add("최");
		set.add("바");
		
		Stream<String> stream = set.stream();
		stream.forEach(name -> System.out.println(name));
		
	}

}

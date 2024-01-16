package ch15.sec03.exam03;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 = new HashSet<String>();

		s1.add("1");
		s1.add("2");
		s1.add("3");
		s1.add("4");

		Iterator<String> iterator = s1.iterator();
		while (iterator.hasNext()) { // 가져올 객체가 있는지 확인
			String element = iterator.next();
			System.out.println(element);
			if (element.equals("1")) {
				iterator.remove();
			}
		}
		System.out.println();

		s1.remove("2");

		for (String element : s1) {
			System.out.println(element);
		}
	}

}

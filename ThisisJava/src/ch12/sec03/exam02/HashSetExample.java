package ch12.sec03.exam02;


import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		
		Student s1 = new Student(1,"이성종");
		hs.add(s1);
		System.out.println("저장된 객체 수: "+hs.size());
		
		Student s2 = new Student(1,"박진호");
		hs.add(s2);
		System.out.println("저장된 객체 수: "+hs.size());
		
		Student s3 = new Student(2,"박진호");
		hs.add(s3);
		System.out.println("저장된 객체 수: "+hs.size());
	}

}

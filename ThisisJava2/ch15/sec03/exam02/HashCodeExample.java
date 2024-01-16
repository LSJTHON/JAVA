package ch15.sec03.exam02;
import java.util.*;

public class HashCodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> s1 = new HashSet<Member>();
		
		
		s1.add(new Member("홍길동",30));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길동",31));
		s1.add(new Member("홍길",31));
		
		System.out.println("총 객체 수: " + s1.size());
	}

}

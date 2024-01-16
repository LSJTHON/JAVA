package ch15.sec05.exam03;
import java.util.TreeSet;
import java.util.NavigableMap;
import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> ts = new TreeSet<Person>();
		
		ts.add(new Person("이성종",450));
		ts.add(new Person("박진호",250));
		ts.add(new Person("임성훈",310));
		
		for(Person person : ts) {
			System.out.println(person.name+": "+person.age);
		}
	
	}

}

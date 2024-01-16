package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores = new TreeSet<>();
		
		
		scores.add(80);
		scores.add(81);
		scores.add(82);
		scores.add(83);
		scores.add(84);
		scores.add(85);
		
		for(Integer s: scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		
		System.out.println("가장 낮은 점수 : "+scores.first());
		System.out.println("가장 높은 점수 : "+scores.last());
		System.out.println("82점 아래 점수 : "+scores.lower(82));
		System.out.println("82점 위의 점수 : "+scores.higher(82));
		System.out.println("82점이거나 바로 아래 점수 : "+scores.floor(82));
		System.out.println("85점이거나 바로 위의 점수 : "+ scores.ceiling(85)+"\n");
		
		
		NavigableSet<Integer> dS = scores.descendingSet();
		for(Integer s : dS) {
			System.out.println(s+" ");
		}
		System.out.println("\n");
		
		
		NavigableSet<Integer> rS = scores.tailSet(80, false);
		for(Integer s : rS) {
			System.out.print(s+" ");
		}
		System.out.println("\n");
		
		rS = scores.subSet(83, true, 85,false);
		for(Integer s : rS) {
			System.out.print(s+" ");
		}
	}
}

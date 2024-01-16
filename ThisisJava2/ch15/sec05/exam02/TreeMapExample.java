package ch15.sec05.exam02;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> tm = new TreeMap<>();
		
		tm.put("apple", 10);
		tm.put("forever", 60);
		tm.put("description", 40);
		tm.put("ever", 50);
		tm.put("zoo", 80);
		tm.put("base", 20);
		tm.put("guess", 70);
		tm.put("cherry", 30);
		
		Set<Entry<String, Integer>> entrySet = tm.entrySet();
		for(Entry<String,Integer> entry : entrySet) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		System.out.println();
		
		Entry<String,Integer> entry = null;
		entry = tm.firstEntry();
		System.out.println("제일 앞 단어 : "+entry.getKey()+"-"+entry.getValue());
		entry = tm.lastEntry();
		System.out.println("제일 뒤 단어 : "+entry.getKey()+"-"+entry.getValue());
		entry = tm.lowerEntry("ever");
		System.out.println("ever 앞 단어"+ " : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		NavigableMap<String,Integer> dm = tm.descendingMap();
		Set<Entry<String, Integer>> ds = dm.entrySet();
		for(Entry<String,Integer> e : ds) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
		
		System.out.println();
		
		System.out.println("[c~h 사이의 단어 검색]");
		NavigableMap<String,Integer> rm = tm.subMap("a", true, "e", false);
		for(Entry<String,Integer> e : rm.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
	}

}

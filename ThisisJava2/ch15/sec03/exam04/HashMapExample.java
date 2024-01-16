package ch15.sec03.exam04;

import java.util.Map;
import java.util.HashMap; //자식
import java.util.Iterator; //set 데이터를 하나씩
import java.util.Map.Entry; //키와 값으로 이루어진 형태
import java.util.Set; //map 데이터를 set에 넣어서 처리


public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m1 = new HashMap<>();
		
		m1.put("이성종",231);
		m1.put("이성종",255); // String 키 중복 : 나중에 들어간 255값을 지닌 이성종 들어감
		m1.put("박성종",231);
		m1.put("김성종",231);
		m1.put("최성종",231);
		m1.put("오성종",231);
		m1.put("전성종",231);
		m1.put("강성종",231);
		
		System.out.println(m1.size());
		System.out.println();
		
		String key = "이성종";
		int value = m1.get(key);
		System.out.println(key + ": "+ value);
		System.out.println();
		
		Set<String> keySet = m1.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = m1.get(k);
			System.out.println(k+" : "+ v);
		}
		System.out.println();
		
		Set<Entry<String, Integer>> entrySet = m1.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k+": "+v);
		}
		System.out.println();
		
		m1.remove("홍길동");
		System.out.println("총 entry 수 : "+m1.size());
		m1.remove("강성종");
		System.out.println("총 entry 수 : "+m1.size());
	}

}

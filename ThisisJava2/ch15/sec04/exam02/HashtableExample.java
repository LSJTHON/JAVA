package ch15.sec04.exam02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		//Map<String,Integer> map = new Hashtable<>();
		Map<String, Integer> map = new HashMap<>();
		Thread tA = new Thread() {
			@Override
			public void run() {
				for(int i =1; i<=1000; i++) {
					map.put(String.valueOf(i),i);
				}
			}
		};
		Thread tB = new Thread() {
			@Override
			public void run() {
				for(int i =1001; i<=2000; i++) {
					map.put(String.valueOf(i),i);
				}
			}
		};
		tA.start();
		tB.start();
		try {
			tA.join();
			tB.join();
		}catch(Exception e) {
		}
		int size = map.size();
		System.out.println("총 엔트리 수: "+size);
		System.out.println();
		
		System.out.println(map.get("255"));
		
		
		
	}

}

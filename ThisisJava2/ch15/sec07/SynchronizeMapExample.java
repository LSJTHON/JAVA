package ch15.sec07;

import java.util.*;

public class SynchronizeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

		Thread tA = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		Thread tB = new Thread() {
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		tA.start();
		tB.start();
		try {
			tA.join();
			tB.join();
		} catch (Exception e) {
		}
		int size = map.size();
		System.out.println("총 객체 수 : "+size);
	}
}
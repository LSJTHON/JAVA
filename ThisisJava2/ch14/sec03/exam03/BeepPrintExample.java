package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample extends Thread {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						System.out.println("1");
						Thread.sleep(500);
					} catch (Exception e) {}
				}
			}
		};
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("2");
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}

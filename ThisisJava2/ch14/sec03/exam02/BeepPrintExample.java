package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					System.out.println("1");
					try {Thread.sleep(500);} catch (Exception e) {}
				}
			}
		});

		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("2");
			try {Thread.sleep(500);} catch (Exception e) {}
		}

	}
}

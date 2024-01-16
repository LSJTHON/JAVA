package ch14.sec03.exam04;

public class SleepExample {
	public static void main(String[] args) {
		for(int i = 0;i<10;i++) {
			System.out.println("1");
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}

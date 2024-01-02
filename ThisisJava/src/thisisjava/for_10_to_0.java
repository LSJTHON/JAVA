package thisisjava;

public class for_10_to_0 {

	public static void main(String[] args) throws InterruptedException {
		int delay = 10;
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
			Thread.sleep(delay);
		}
		System.out.println("발사~!");
	}
}

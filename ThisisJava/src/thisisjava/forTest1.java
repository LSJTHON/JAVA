package thisisjava;

public class forTest1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
		sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		sum =0;
		for(int i =100; i>=50; i--) {
			sum += i;
		}
		System.out.println(sum);
		for (char i='a';i<='z';i++) {
			System.out.println(i);
		}
	}
}

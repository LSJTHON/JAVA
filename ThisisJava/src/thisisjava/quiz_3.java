package thisisjava;

import java.util.*;

public class quiz_3 {

	public static void main(String[] args) {
//		문제 3. 주어진 연도가 윤년인지 아닌지를 출력하는 프로그램을 설계하고 작성하라. 
//		한 연도가 4로 나누어지고 100으로 나누어지지 않으면 그 연도는 윤년이다. 예를 들면 
//		1796년은 1796이 4로 나누어지고 100으로 나누어지지 않으므로 윤년이다. 또한 한 연도가
//		4로 나누어지고 100으로 나누어질 뿐만아니라 400으로도 나누어지면 그 연도는 윤년이다. 
//		예를 들면 2000년은 윤년이나 1800년은 윤년이 아니다. 프로그램은 '연도를 입력하세요'라는 
//		메세지를 출력한 후 연도를 입력 받아야 한다. 그리고 연도가 윤년이면 'xxxx년은 윤년입니다'를 
//		출력하고 아니면 'xxxx년은 윤년이 아닙니다'를 출력해야 한다. 여기서 xxxx는 입력 받은 연도이다.
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하이소:\t");
		year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0) 
			System.out.println(year+"년도는 윤년입니다.");
		else if (year % 4 == 0 && year % 400 == 0) 
			System.out.println(year+"년도는 윤년입니다.");
		else 
			System.out.println(year+"년도는 윤년이 아닙니다.");
	}
}
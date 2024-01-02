package thisisjava;
import java.util.*;
public class quiz_2 {

	public static void main(String[] args) {
//		문제 2. 입력 받은 양의 정수가 3의 배수, 5의 배수 혹은 8의 배수인지를 알려주는 
//		프로그램을 설계하고 작성하라. 양의 정수가 3의 배수이면 '3의 배수이다'를 출력하고 5의 
//		배수이면 '5의 배수이다'를 출력하며 8의 배수이면 '8의 배수이다'를 출력하고 그 외의 경우이면 
//		'어느 배수도 아니다'를 출력하라.
		int number;
		
		Scanner sc = new Scanner(System.in); //변수 입력을위한 scanner 객체 생성
		
		System.out.println("양의 정수를 입력하세요:\t"); 
		number = sc.nextInt(); //number 변수 입력문
		
		if(number % 3 == 0 ) { // 3으로 나누었을때 나머지가 0이되는 경우 참
			System.out.println(number+ " 3의 배수입니다.");
			if(number %5 == 0) {  //5으로 나누었을때 나머지가 0이되는 경우 참
				System.out.println(number+" 5의 배수입니다.");
				if(number % 8 == 0)  //8으로 나누었을때 나머지가 0이되는 경우 참
					System.out.println(number+" 8의 배수입니다.");
			}
		}
	}

}

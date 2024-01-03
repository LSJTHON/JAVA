package thisisjava;
import java.util.*;
public class RandomNumbertest {

	public static void main(String[] args) {
		
		int count;
		int targetNumber;
		int guessNumber;
		final int sentinel = -99;
		int again;
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);

		Exit1 : while(true) {
			count=0;
			targetNumber = generator.nextInt(100)+1;
			System.out.println("숫자를 알아보아요 : "+targetNumber);
			guessNumber = sc.nextInt();
			count++;
			
			while(targetNumber != guessNumber){
				if(guessNumber == sentinel) break Exit1;
				count++;
				if(guessNumber>targetNumber) {
					System.out.println("선택한 숫자보다 작아요 ^^7"); 
				}
				else System.out.println("선택한 숫자보다 커요 ^^7"); 
			
				System.out.println("다시 알아보아요 : ");
				guessNumber = sc.nextInt();
				
			};
			System.out.println("정답입니다!!!!!"
					+"\n시도 횟수: "+count
					+"\n한번 더 진행할겨?: 그만하기 0");
			again = sc.nextInt();
			if(again == 0) break;
		}
		System.out.println("게임을 종료합니다.");
	}

}

package thisisjava2;

import java.util.*;

public class ArrayQuizNumber9 {

	public static void main(String[] args) {

		String select; // 번호입력
		int count = 0; // 학생수
		int maxScore = 0;
		int sum = 0;
		int[] scoreList = null;
		Scanner sc = new Scanner(System.in);
		
		Exit: while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택:");
			select = sc.next();
			
			switch (select) {
			case "1":
				System.out.println("학생수를 입력하세요: ");
				count = sc.nextInt();
				scoreList = new int[count];
				break;
			case "2":
				System.out.println("점수를 3번 입력하세요 : ");
				for (int i = 0; i < scoreList.length; i++) {
					System.out.print((i + 1) + "번: ");
					scoreList[i] = sc.nextInt();
					sum += scoreList[i];
				}
				break;
			case "3":
				System.out.println("점수리스트를 출력하겠습니다.");
				for (int i = 0; i < scoreList.length; i++) {
					System.out.println((i + 1) + "번: " + scoreList[i]);
				}
				break;
			case "4":
				for (int i = 0; i < scoreList.length; i++) {
					if (scoreList[i] >= maxScore) {
						maxScore = scoreList[i];
					}
				}
				System.out.println("최고 점수: " + maxScore);
				System.out.println("평균 점수: " + (sum / count));
				break;
			case "5":
				break Exit;
			}
		}
	}

}

package thisisjava;

import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		// 한 과목의 평가 요소들의 점수들을 저장하는 변수들을 선언한다
		int attend; // 출석
		int assignment; // 과제
		int quizs; // 수시
		int mid; // 중간
		int finalScore; // 기말

		// 총점을 저장하는 변수를 선언한다
		double resultScore;

		// 학점을 저장하는 변수를 선언한다
		char gradeCount;

		// 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
		Scanner scan = new Scanner(System.in);

		// 사용자로부터 각 평가 요소의 점수를 한 번에 하나씩 입력하라고 요청한다.
		// 그리고 입력된 점수를 읽는다.
		System.out.print("출석 점수를 입력하세요:\t");
		attend = scan.nextInt();
		System.out.print("과제 점수를 입력하세요:\t");
		assignment = scan.nextInt();
		System.out.print("수시 시험 점수를 입력하세요:\t");
		quizs = scan.nextInt();
		System.out.print("중간시험 점수를 입력하세요:\t");
		mid = scan.nextInt();
		System.out.print("기말 시험 점수를 입력하세요:\t");
		finalScore = scan.nextInt();

		// 총점을 계산한다
		resultScore = (int)((attend * 0.1) + (assignment * 0.4) + (quizs * 0.1) + (mid * 0.2) + (finalScore * 0.2));

		
		if (resultScore >= 90) {
			gradeCount = 'A';
		} else if (resultScore >= 80) {
			gradeCount = 'B';
		} else if (resultScore >= 70) {
			gradeCount = 'C';
		} else if (resultScore >= 60) {
			gradeCount = 'D';
		} else {
			gradeCount = 'F';
		}


		System.out.println("총점:\t" + (double)(resultScore) + "\n학점:\t" + gradeCount);


	}

}

package thisisjava;

import java.util.*;

public class whileTest1 {

	public static void main(String[] args) throws InterruptedException {
		int score;
		int count = 0;
		int max = -1;
		int min = 101;
		int sum = 0;
		double aver;
		Scanner sc = new Scanner(System.in);
		// 점수를 원하는 횟수만큼 입력하세요
		System.out.println("점수를 입력하세요:\t");
		score = sc.nextInt();

		while (score != -99) {
			count++;

			if (score != -99) {
				if (score > max)max = score;
				if (score < min)min = score;
				sum += score;
				
			System.out.println("점수를 입력하세요:\t");
			score = sc.nextInt();
			}
		}
		aver = sum / count;
		System.out.println("평균점수는: " + aver + "\n최저점수는: " + min + "\n최고점수는: " + max);
	}

}

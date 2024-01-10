package ch12.sec07;

import java.util.*;

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		int count =0;
		boolean a = true;
		while(a) {
			Random random = new Random();
			System.out.print("선택번호: ");
			for (int i = 0; i < 6; i++) {
				selectNumber[i] = random.nextInt(45) + 1;
				System.out.print(selectNumber[i] + " ");
			}
			System.out.println();
	
			int[] winningNumber = new int[6];
			random = new Random();
			System.out.print("당첨번호: ");
			for (int i = 0; i < 6; i++) {
				winningNumber[i] = random.nextInt(45) + 1;
				System.out.print(winningNumber[i] + " ");
			}
			System.out.println();
	
			Arrays.sort(selectNumber);
			Arrays.sort(winningNumber);
			boolean result = Arrays.equals(selectNumber, winningNumber);
			System.out.print("당첨여부: ");
			if (result) {
				System.out.print("1등에 당첨되셨습니다.");
				a = false;
			} else {
				count++;
				/*for (int i = 0; i < winningNumber.length; i++) {
					for (int j = 0; j < selectNumber.length; j++) {
						if(winningNumber[i]==selectNumber[j]) {
							count++;
						}
						
					}
				}*/
				System.out.println("당첨되지 않았습니다.\n"+"시도 횟수: "+count);
			}
		}
	}
}

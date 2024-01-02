package thisisjava;
import java.util.*;
public class whileTest2 {

	public static void main(String[] args) {
		int score;
		int totalCount=0;
		int Acount =0;
		int Bcount =0;
		int Ccount =0;
		int Dcount =0;
		int Fcount =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요:");
		score = sc.nextInt();
		
		while(score != -1) {
			totalCount++;
			if(score >= 90) Acount++;
			else if(score >= 80) Bcount++;
			else if(score >= 70) Ccount++;
			else if(score >= 60) Dcount++;
			else Fcount++;
			System.out.println("점수를 입력하세요:");
			score = sc.nextInt();
		}
		System.out.println("점수들의 총수 : "+totalCount
				+"\nA학점:"+Acount
				+"\nB학점:"+Bcount
				+"\nC학점:"+Ccount
				+"\nD학점:"+Dcount
				+"\nF학점:"+Fcount);
		
	}

}

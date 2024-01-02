package thisisjava;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		//회사의 입사 지원 대상자 여부를 지원자의
		//평점과 토익 점수에 따라 다음과 같이 출력하는 프로그램을 작성
		// 평점이 4.0이상 토익 700이상이면 면접 대상자
		//3.5 이상이고 4.0 미만이면서 700점 이상 서류전형 대상자
		//3.0 이상 3.5미만 700이상이면 필기시험 대상자
		//3.0미만이거나 700점미만 지원할 수 없다를 출력
		// 부울 연산식 사용
		//if문 사용
		//기본 입력문 사용
		//평점을 입력하세요 : 3.8
		//토익점수를 입력하세요 : 780
		// 서류전형 대상자입니다

		int t; //평점과 토익점수
		float s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("평점을 입력하세요: ");
		s = sc.nextFloat();
		System.out.println("토익 점수를 입력하세요: ");
		t = sc.nextInt();
		
		if(t >= 700) {
			if(s >=4.0) {
				System.out.println("면접 대상자입니다.");
			} else if(s >= 3.5) {
				System.out.println("서류전형 대상자입니다");
			} else if(s >= 3.0) {
				System.out.println("필기시험 대상자입니다.");
			} else {
				System.out.println("지원할 수 없는 대상자");
			}
		} else {
			System.out.println("지원할 수 없는 대상자");
		
		}
	}

}

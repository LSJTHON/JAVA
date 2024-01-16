package Quiz.num6;
import java.util.*;
//실습과제 8.1: Student.java
//학생의 성적 기록을 나타낸다
class  StudentDriver{
	public static void main (String[] args){
		// 두 학생의 성적 기록을 나타내는 객체들을 만든다
		Scanner sc = new Scanner(System.in);
		
		
		Student st1 = new Student("선남");
  			// 여기에 코드를 삽입하세요

		// 첫 번째 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다
		st1.inputGrades();
		

		// 첫 번째 학생의 총점을 계산한다
		double st1Score = st1.getTotal();
		// 첫 번째 학생의 학점을 부여한다
  			// 여기에 코드를 삽입하세요
  		String st1Grade = st1.grade1();
		// 첫 번째 학생의 이름, 총점과 학점을 출력한다
		System.out.println(st1.getName() + "의 총점은 " + st1Score + "이고 학점은 " + st1Grade + "이다.");

		
		Student st2 = new Student("선녀");
		// 두 번째 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다
  			// 여기에 코드를 삽입하세요
		st2.inputGrades();
		// 두 번째 학생의 총점을 계산한다
  			// 여기에 코드를 삽입하세요
		double st2Socre = st2.getTotal();
		// 두 번째 학생의 학점을 부여한다
  			// 여기에 코드를 삽입하세요
		String st2Grade = st2.grade1();
		// 두 번째 학생의 이름, 총점과 학점을 출력한다
		System.out.println(st2.toString());
   }
}

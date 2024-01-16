package Quiz.num6;

//실습과제 8.1: Student.java
//학생의 성적 기록을 나타낸다

import java.util.Scanner;

public class Student {
	// 객체 변수들
	String name; // 이름
	int quizscore; // 퀴즈 점수
	int midtermscore; // 중간시험 점수
	int finalscore; // 기말시험 점수
	private double total;
	private String grade1;

	// 생성자메소드: 학생의 이름을 넘겨 받아 객체를 생성한다
	public Student(String studentName) {
		name = studentName;
	}

	// 학생의 이름을 반환한다
	public String getName() {
		return name;
	}

	// 학생의 퀴즈 점수를 반환한다
	public int getQuizScore() {
		return quizscore;
	}

	// 학생의 중간시험 점수를 반환한다
	public int getMidtermScore() {
		return midtermscore;
	}

	// 학생의 기말시험 점수를 반환한다
	public int getFinalScore() {
		return finalscore;
	}

	// 현 Student 객체의 정보에 대한 문자열을 반환한다.
	public String toString() {
		String str = "";
		str += "이름: " + name + "\n" + "총점은: " + total + "학점은: " + grade1;
		return str;
	}

	// 이름을 주어진 값으로 변경한다
	public void setName(String Name) {
		name = Name;
	}

	// 퀴즈 점수를 주어진 값으로 변경한다
	public void setQuizScore(int QuizScore) {
		quizscore = QuizScore;
	}

	// 중간시험 점수를 주어진 값으로 변경한다
	public void setMidtermScore(int MidtermScore) {
		midtermscore = MidtermScore;
	}

	// 기말시험 점수를 주어진 값으로 변경한다
	public void setFinalScore(int FinalScore) {
		finalscore = FinalScore;
	}

	// 사용자에게 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다.
	// 입력 요청시 이름을 사용한다. 예를 들면, ‘길동의 중간시험 점수를 입력하라.’
	public void inputGrades() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(name + "의 퀴즈 점수를 입력해라: ");
			setQuizScore(Integer.parseInt(sc.next()));
			if (getQuizScore() < 0 || getQuizScore() > 100) {
				System.out.println("점수가 0보다 작거나 100보다 커요 다시 입력하세요");
			} else {
				break;
			}
		}while(true);

		System.out.println(name + "의 중간 점수를 입력해라: ");
		setMidtermScore(midtermscore = Integer.parseInt(sc.next()));
		System.out.println(name + "의 기말 점수를 입력해라: ");
		setFinalScore(finalscore = Integer.parseInt(sc.next()));
	}

	// 학생의 시험 점수들의 총점을 계산하여 반환한다
	public double getTotal() {
		total = quizscore * 0.2 + midtermscore * 0.3 + finalscore * 0.5;
		return total;
	}

	// 학생의 학점을 반환한다
	public String grade1() {
		if (total >= 90)
			grade1 = "A";
		else if (total >= 80)
			grade1 = "B";
		else if (total >= 70)
			grade1 = "C";
		else if (total >= 60)
			grade1 = "D";
		else
			grade1 = "F";
		return grade1;
	}
}
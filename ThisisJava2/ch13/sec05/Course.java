package ch13.sec05;

public class Course {

	
	//모든 타입 입력 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+
				"이(가) Course1을 등록함");
	}
	
	//학생만 등록 가능 : ?extends Student : Student와 그 아래 자식만 등록 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이(가) Course2을 등록함");
	}
	
	// ? super Worker : Worker 와 그 상위만 입력 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이(가) Course3을 등록함");
	}
}

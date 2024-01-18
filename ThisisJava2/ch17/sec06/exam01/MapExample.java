package ch17.sec06.exam01;
import java.util.ArrayList;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동",85));
		studentList.add(new Student("홍길동",92));
		studentList.add(new Student("홍길동",87));
		
		studentList.stream()
			.mapToInt(s -> s.getScore())     // getScore : score 값만 가져오겠다.
			.forEach(score -> System.out.println(score));
	}

}

package Quiz.num10;

import java.util.Arrays;
import java.util.List;
public class num10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<num10> list = Arrays.asList(
				new num10("신종현",30),
				new num10("임성훈",40),
				new num10("박진호",26)
				);
		
		double avg = list.stream()
				//.mapToInt(n -> n.getAge())
				.mapToInt(num10 :: getAge)
				.average()
				.getAsDouble();
				
		System.out.println("세 얼간이의 평균: "+avg);
	}

}

package ch12.sec11.examtest;
import java.util.*;
import java.text.*;
public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 \nHH시 mm분 ss초");
		String now2 = sdf.format(now);
		System.out.println(now2);
	}

}

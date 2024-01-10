package ch12.sec08;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTimeOperatioExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a HH시 mm분 ss초");
		
		System.out.println("현재시간: "+now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(100);
		System.out.println("100년 덧셈: "+result1.format(dtf));
		
		LocalDateTime result2 = now.minusMonths(2);
		System.out.println("1년 뺄셈: "+result2.format(dtf));
		
		LocalDateTime result3 = now.plusDays(7);
		System.out.println("7일 덧셈: "+result3.format(dtf));
	}

}

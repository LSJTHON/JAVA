package ch18.sec09;

import java.io.*;
public class PrintStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		ps.printf("| %6d | %-10s | %10s | \n",1,"김정은","독재자");
		ps.printf("| %6d | %-10s | %10s | \n",2,"김정일","독재자");
		
		ps.flush();
		ps.close();
	}

}

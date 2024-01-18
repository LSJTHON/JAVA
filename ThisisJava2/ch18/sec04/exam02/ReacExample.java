package ch18.sec04.exam02;

import java.io.*;

public class ReacExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader reader = null;
			
			reader = new FileReader("C:/Temp2/test.txt"); //텍스트 파일로부터 문자 입려  스트림생성
			while(true) {
				int data = reader.read(); // 1 문자를 읽음
				if(data == -1) break; // 파일을 다 읽으면 while 문 종료
				System.out.print((char)data); //읽은 문자 출력
			}
			reader.close(); 
			System.out.println();
				reader = new FileReader("C:/Temp2/test.txt");
				char[] data = new char[100];
				while(true) {
					
					int num = reader.read(data); //읽은 문자는 배열에 저장,읽은 문자 수는 리턴
					if(num == -1) break;
					for(int i = 0; i <num; i++) { // 읽은 문자 수만큼 출력
						System.out.print(data[i]);
					}
				}
			reader.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

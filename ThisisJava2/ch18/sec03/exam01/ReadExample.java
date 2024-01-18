package ch18.sec03.exam01;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//데이터 추랍ㄹ지를 test1.db 로 하는 입력 스트림 생성
			InputStream is = new FileInputStream("C:/Temp2/test3.db");
			
			while(true) {
				int data = is.read(); //1바이트씩 읽기 다 읽었다면 data는 -1
				if(data == -1) break; //파일 끝에 도달했을 경우 break; EOF
				System.out.println(data);
			}
			is.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

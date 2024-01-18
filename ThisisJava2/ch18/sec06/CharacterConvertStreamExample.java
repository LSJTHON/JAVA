package ch18.sec06;
import java.io.*;
public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	public static void write(String str) throws Exception{
		//FileOutput에 OutputStreamWriter 보조 스트림을 연결
		OutputStream os = new FileOutputStream("C:/Temp2/test.txt");
		Writer writer = new OutputStreamWriter(os,"UTF-8");
		
		writer.write(str); // OutputStreamWriter 보조 스트림을 이용해서 문자 출력
		writer.flush();
		writer.close();
	}
	public static String read() throws Exception {
		//FileInputStream에 InputStreamReader보조 스트림에 연결
		InputStream is = new FileInputStream("C:/Temp2/test.txt");
		Reader reader = new InputStreamReader(is,"UTF-8");
		char[] data = new char[100]; //InputStreamReader 보조 스트림을 이용해서 문자 입력
		int num = reader.read(data);
		reader.close();
		String str = new String(data,0,num); //char 배열에서 읽은 문자 수만큼 문자열로 변환
		return str;
	}
}

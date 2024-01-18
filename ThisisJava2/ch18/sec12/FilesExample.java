package ch18.sec12;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
public class FilesExample {

	public static void main(String[] args) {
		try {
			String data = ""+
					"id: 이성종\n"+
					"email: dltjdwhd1235@naver.com\n"+
					"tel: 010-7266-3760\n"+
					"message: 건들면 물어요.";
			//Path 객체 생성
			Path path = Paths.get("C:/Temp/Warnning.txt");
			//파일 생성 및 데이터 저장
			Files.writeString(Paths.get("C:/Temp/Warnning.txt"),data, Charset.forName("UTF-8"));
			// 파일 정보 얻기
			System.out.println("파일 유형: "+Files.probeContentType(path));
			System.out.println("파일 크기: "+Files.size(path)+ " bytes");
			//파일 읽기
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

package ch18.sec03.exam03;
import java.io.*;

public class CopyExample {

	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/Temp2/bonobono.jpg";
		String targetFileName = "C:/Temp2/bonobono2.jpg";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data,0,num);
		}
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복자가 잘 되었습니다.");
	}

}


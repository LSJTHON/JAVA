package ch18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExamaple {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp2/test3.db");
			byte[] array = {10,20,30,40,50};
			
			os.write(array);
			
			os.flush();
			os.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

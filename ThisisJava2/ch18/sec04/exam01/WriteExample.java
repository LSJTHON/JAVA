package ch18.sec04.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Writer writer = new FileWriter("C:/Temp2/test.txt");
			
			char a ='A';
			writer.write(a);
			char b ='B';
			writer.write(b);
			
			char [] arr = {'C','D','E'};
			writer.write(arr);
			
			writer.write("FGH");
			
			writer.flush();
			writer.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

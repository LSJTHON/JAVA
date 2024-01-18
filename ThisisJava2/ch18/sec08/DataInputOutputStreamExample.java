package ch18.sec08;

import java.io.*;
public class DataInputOutputStreamExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		
		dos.writeUTF("김정은");
		dos.writeDouble(135.5);
		dos.writeInt(1);
		
		dos.writeUTF("김정일");
		dos.writeDouble(110.3);
		dos.writeInt(2);
		
		dos.writeUTF("김일성");
		dos.writeDouble(100.4);
		dos.writeInt(3);
		
		dos.flush(); dos.close(); fos.close();
		
		//DataInputStream 으로 저장된 데이터를 읽어 와서 바로 사용하기
		FileInputStream fis = new FileInputStream("C:/Temp/Primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		//기본 타입 입력
		for(int i =0; i<3; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name+ " : "+score+" : "+order);
		}
		dis.close(); fis.close();
	}
}

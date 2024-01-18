package ch18.sec10;

import java.io.*;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//객체 생성 -> OOS로 파일 저장
		Member m1 = new Member("fail","단풍이");
		Product p1 = new Product("노트북",1500000);
		int[] arr1 = {1,2,3};
		
		
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		oos.flush(); oos.close(); fos.close();
		
		//파일 불러오기 : 역직렬화 데이터를 객체에 담기
		FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		Member m2 = (Member)ois.readObject();
		Product p2 = (Product)ois.readObject();
		int[] arr2 = (int[])ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
	}

}

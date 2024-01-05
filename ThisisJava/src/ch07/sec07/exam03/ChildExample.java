package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p2 = new Child();
		
		p2.field1 = "data1";
		p2.method1();
		p2.method2();
		System.out.println("부모 필드1 "+p2.field1);
		
	//	p2.field2 = "data2"; //자동 형변환으로 필드2 없음
		//parent.method3(); //
		
		Child child = (Child)p2;
		
		child.field2 = "data2";
		child.method3();
		
		System.out.println(child.field2);
		
	}

}

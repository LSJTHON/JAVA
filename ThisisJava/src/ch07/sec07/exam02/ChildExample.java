package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		child.method1();
		child.method2();
		child.method3();
		parent.method1();
		parent.method2();
		
		
		Parent p1 = new Child(); //자식을 부모 객체 타입형으로 자동 변환
		p1.method1();
		p1.method2(); //타입이 부모일지라도 오버라이딩으로 수정된 메소드는 자식을 호출
		//p1.method3(); //타입은 부모 객체이므로 사용 불가능
		
	}

}

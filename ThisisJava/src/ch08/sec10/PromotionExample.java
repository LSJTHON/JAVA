package ch08.sec10;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		
		C c = new C();
		
		D d = new D();
		
		E e = new E();
		
		A a;
		
		a= b;
		a= c;  //a로 들어간 클래스들은 모드 타입이 강제로 A로 바뀐다
		a= d;  //인터페이스안에 있는 메소드를 사용 가능
		a= e;
	}

}

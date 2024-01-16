package ch13.sec03.exam01;

public class GenericExample {
	//반환되는 타입은 T Box boxing 메소드 매개변수 타입을 알 수 없다.
	public static <T> Box<T> boxing(T t){
		
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = boxing(100); //box1 객체의 T 필드에 100을 대입
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}

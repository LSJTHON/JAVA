package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton(); Singleton은 private 이므로 객체생성 불가능
		
		Singleton obj1 = Singleton.getInstance();
		//접근권한이 없기 때문에 getInstance에서 따로 호출해야함

		Singleton obj2 = Singleton.getInstance();
		//obj1, obj2 는 Singleton안에 같은 singleton객체를 지니게 된다.
		
		if(obj1 == obj2) System.out.println("같은 객체입니다.");
		else  System.out.println("다른 객체입니다.");
	}

}

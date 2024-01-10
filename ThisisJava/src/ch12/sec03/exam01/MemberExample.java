package ch12.sec03.exam01;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member ob1 = new Member("blue");
		Member ob2 = new Member("blue");
		Member ob3 = new Member("red");
		
		if(ob1.equals(ob2)) {
			System.out.println("ob1과 ob2는 동등합니다.");
		}else {
			System.out.println("ob1과 ob2는 다릅니다.");
		}
		
		if(ob1.equals(ob3)) {
			System.out.println("ob1과 ob3는 동등합니다.");
		}else {
			System.out.println("ob1과 ob3는 다릅니다.");
		}
	}

}

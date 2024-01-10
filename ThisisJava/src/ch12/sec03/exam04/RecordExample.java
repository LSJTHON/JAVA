package ch12.sec03.exam04;

public class RecordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem1 = new Member("winter","이성종",25);
		
		System.out.println(mem1.id());
		System.out.println(mem1.name());
		System.out.println(mem1.age());
		System.out.println(mem1.toString());
		System.out.println();
		
		
		Member mem2 = new Member("winter","이성종",25);
		Member mem3 = new Member("winter","이성종",25);
		System.out.println(mem2.hashCode());
		System.out.println(mem3.hashCode());
		System.out.println(mem2.equals(mem3));
	}

}

package ch07.sec09;

public class Student extends Person{
	public int studentNo;
	
	public Student(String name, int studentNum) {
		super(name);
		this.studentNo = studentNo;
	}
	public void study() {
		System.out.println("뒤지기 싫으면 공부해라");
	}
}

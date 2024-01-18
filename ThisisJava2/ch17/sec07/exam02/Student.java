package ch17.sec07.exam02;

public class Student {
	private String name;
	private int score;
	
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {return name;}
	public int getScore() {return score;}
	//재정의는 하지 않는다 
}

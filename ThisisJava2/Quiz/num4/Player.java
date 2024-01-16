package Quiz.num4;

public class Player {
	
	private String name;
	private int total;
	
	public Player(String name){
		//this.name = name;
		setName(name);
	}
	
	public void roll(PairOfDice dice) {
		int value1, value2;
		dice.roll();
		value1 = dice.getFaceValue1();
		value2 = dice.getFaceValue2();
		total = value1 + value2;
		System.out.println("주사위1: "+value1+" 주사위2: "+value2+" 주사위합: "+total);
	}
	
	public String getName() {return name;}
	
	public void setName(String name) {this.name = name;}
	
	
	public int getTotal() {return total;}
	
	public void setTotal(int total) {this.total = total;}
	
	
	
}

package Quiz.num4;
//import java.util.*;
public class PairOfDice {
	private int faceValue1; //dice1
	private int faceValue2; //dice2
	
	
	//생성자 필드값 초기화
	public PairOfDice() {
		faceValue1 = 1;
		faceValue2 = 1;
	}

	public void roll() {
		faceValue1 = (int) ((Math.random()*6)+1);  //1~6
		faceValue2 = (int) ((Math.random()*6)+1);  //1~6
	}
	
	public int getFaceValue1() {return faceValue1;}

	public int getFaceValue2() {return faceValue2;}
	
}

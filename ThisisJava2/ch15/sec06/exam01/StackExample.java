package ch15.sec06.exam01;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>();
		Coin c = null;
		
		coinBox.push(new Coin(1000));//7
		
		coinBox.push(new Coin(10));  //6
		
		coinBox.push(new Coin(100)); //4
		
		coinBox.push(new Coin(500)); //1
		c = coinBox.pop();
		System.out.print(c.getValue()+" ");
		coinBox.push(new Coin(50));  //3
		
		coinBox.push(new Coin(5000)); //2
		c = coinBox.pop();
		System.out.print(c.getValue()+" ");
		coinBox.push(new Coin(50000)); //5
		c=coinBox.pop();
		c=coinBox.pop();
		System.out.print(c.getValue()+" ");
		c=coinBox.pop();
		System.out.print(c.getValue()+" ");

		c=coinBox.push(new Coin(50000)); //5
		System.out.print(c.getValue()+" ");
		c=coinBox.pop();
		c=coinBox.pop();
		System.out.print(c.getValue()+" ");
		c=coinBox.pop();
		System.out.print(c.getValue()+" ");
		
		
	}

}

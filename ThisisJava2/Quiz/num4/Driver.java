package Quiz.num4;
import java.util.*;


public class Driver {

	public static void main(String[] args) {
		PairOfDice dice = new PairOfDice();
		Scanner sc = new Scanner(System.in);
		Player p1 = new Player("이성종");
		Player p2 = new Player("박진호");
		String flag="예";
		
		do {
		System.out.println(p1.getName());
		p1.roll(dice);
		
		System.out.println(p2.getName());
		p2.roll(dice);
		
		if(p1.getTotal()>p2.getTotal()) System.out.println(p1.getName()+" 이김\n"+p2.getName()+": 다시해!!");
		else if(p1.getTotal()<p2.getTotal()) System.out.println(p2.getName()+" 이김\n"+p1.getName()+": 다시해!!");
		else System.out.println("비김\n게임 다시할겨?");
		System.out.println("승부에 응하시겠습니까");
		flag = sc.next();
	
		}while(flag.equals("예"));
	}
}

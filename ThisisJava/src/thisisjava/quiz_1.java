package thisisjava;
import java.util.*;
public class quiz_1 {

	public static void main(String[] args) {
//		문제 1. 할인점에서 고객에게 청구 금액을 계산하는 프로그램을 설계하고 작성하라. 
//		고객이 30만원 이상 구매하면 3만원을 할인해 주어야 하고, 30만원 미만 10만원 이상을 구매하면 
//		5,000원을 할인해 주어야 하며, 10만원 미만을 구매하면 할인이 없어야 한다. 키보드로 부터 구매 
//		금액을 입력 받아야 한다. 구매 금액과 청구 금액을 출력해야 한다.
		int money;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("청구금액을 입력하세요 :\t");
		money = sc.nextInt();
		
		if(money >= 300000) {
			System.out.println("구매 금액은:\t"+ money + "\n청구 금액은:\t"+(money-10000));
		}else if(money >= 100000) {
			System.out.println("구매 금액은:\t"+ money + "\n청구 금액은:\t"+(money-5000));
		}else {
			System.out.println("구매 금액은:\t"+ money + "\n청구 금액은:\t"+money);
		}
		
	}

}

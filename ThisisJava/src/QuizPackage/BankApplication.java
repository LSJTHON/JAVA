package QuizPackage;

import java.util.*;

public class BankApplication {

	private static Account[] accountArray = new Account[100]; // 계좌여러명 생성하기
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("=========================================="
							  +"\n1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료"
							  +"\n==========================================");
			int selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1)
				creatAccount();
			else if (selectNo == 2)
				accountList();
			else if (selectNo == 3)
				deposit();
			else if (selectNo == 4)
				withdraw();
			else if (selectNo == 5)
				run = false;

		}
		System.out.println("시스템 종료");
	}

	private static void creatAccount() {
		System.out.println("======="
							+"\n계좌생성"
							+"\n======="
							+"\n계좌번호:");
		String ano = sc.nextLine();
		System.out.println("계좌주:");
		String owner = sc.nextLine();
		System.out.println("초기입금액:");
		int balance = Integer.parseInt(sc.nextLine());
		//int balance = sc.nextInt();
		Account customer = new Account(ano, owner, balance);
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i] = customer;
				break;
			}
			else {
				if(ano.equals(accountArray[i].getAno())) {
					System.out.println("같은 계좌번호가 있습니다 다시 입력하세요.");
					break;
				}
			}
			
		}
		System.out.println("계좌가 생성되었습니다.");
	}

	private static void accountList() {
		for(int i = 0; i < accountArray.length;i++)
			if(accountArray[i]!=null)
				System.out.println("\n계좌목록: "
				+"\t"+accountArray[i].getAno()
				+"\t"+accountArray[i].getOwner()
				+"\t"+accountArray[i].getbalance());
	}

	private static void deposit() {
		System.out.println("계좌번호: ");
		String accountNo = sc.nextLine();
		System.out.println("예금액: ");
		int newbalance = Integer.parseInt(sc.nextLine());
		for (int i =0; i<accountArray.length; i++) {
			if(accountNo.equals(accountArray[i].getAno())) {
				accountArray[i].setbalance((accountArray[i].getbalance()+newbalance));
				break;
			}
		}
	}

	private static void withdraw() {
		System.out.println("계좌번호: ");
		String accountNo = sc.nextLine();
		System.out.println("출금액: ");
		int newbalance = Integer.parseInt(sc.nextLine());
		for (int i =0; i<accountArray.length; i++) {
			if(accountNo.equals(accountArray[i].getAno())) {
				if(newbalance > accountArray[i].getbalance()) {
					System.out.println("너 돈없잖아");
					break;
				}
				else {
					accountArray[i].setbalance((accountArray[i].getbalance()-newbalance));
					break;
				}
			}
		}
	}

}

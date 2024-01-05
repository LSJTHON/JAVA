package QuizPackage;
import java.util.*;
public class Account {
	private String ano; //계좌번호
	private String owner; //계좌주
	private int balance; //예금액
	
	public Account(String ano, String owner, int balance) {
		this.ano= ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano=ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getbalance() {return balance;}
	public void setbalance(int balance) {this.balance = balance;}
}

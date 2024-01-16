package Quiz.num1;

//실습과제 11.3: Car.java
//승용차를 모델한다

public class Car extends Vehicle
{
	// 승용차의 배기량에 대한 객체 변수를 선언한다
	// 여기에 코드를 입력하세요
	private double tax;
	// 승용차의 모델명, 가격과 배기량을 주어진 값으로 초기화하면서
	// 객체를 생성한다
 // 여기에 메소드를 입력하세요
	
	public Car(String model,int money, int begi) {
		super(model,money,begi);

	}
	
	// 승용차의 배기량을 반환한다
 // 여기에 메소드를 입력하세요
	public double getBegi() {
		return begi;
	}
	// 승용차의 세금을 계산한다
 // 여기에 메소드를 입력하세요
	public double taxPrice() {
		if(this.begi>= 3000) {
			tax = money*0.04;
		}else if(this.begi>=1500) {
			tax = money *0.03;
		}else {
			tax = money *0.01;
		}
		return tax;
	}
	// 승용차의 모델명, 가격과 배기량을 반환한다
 // 여기에 메소드를 입력하세요
	public String modelNameMoney() {
		return super.modelNameMoney()+", 배기량: "+begi;
	}

	// 승용차의 배기량을 주어진 값으로 변경한다
 // 여기에 메소드를 입력하세요
	public void setBegi(double begi) {
		
		this.begi = begi;
	}
}
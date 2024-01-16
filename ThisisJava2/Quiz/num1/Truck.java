package Quiz.num1;
//실습과제 11.3: Truck.java
//트럭를 모델한다

public class Truck extends Vehicle{
	
	// 트럭의 적재 중량에 대한 객체 변수를 선언한다
	private int Weight;
	public double tax;
	// 트럭의 모델명, 가격과 적재 중량을 주어진 값으로 초기화하면서
	// 객체를 생성한다
 // 여기에 메소드를 입력하세요
	public Truck(String model, int money, int begi) {
		super(model, money, begi);
	}
	// 트럭의 적재 중량을 반환한다
 // 여기에 메소드를 입력하세요
	public int getWeight() {
		return Weight;
	}
	// 트럭의 세금을 계산한다
 // 여기에 메소드를 입력하세요
	public double taxPrice() {
		if(this.Weight>= 10000) {
			tax = money*0.04;
		}else if(this.Weight>=5000) {
			tax = money *0.02;
		}else {
			tax = money *0.01;
		}
		return tax;
	}
	// 트럭의 모델명, 가격과 적재 중량을 반환한다
 // 여기에 메소드를 입력하세요
	public String modelNameMoney() {
		return super.modelNameMoney()+", 배기량: "+begi;
	}
	
	// 트럭의 적재 중량을 주어진 값으로 변경한다
// 여기에 메소드를 입력하세요
	public void setWeight(int weight) {
		Weight = weight;
	}
}
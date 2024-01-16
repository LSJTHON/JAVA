package Quiz.num1;

public abstract class Vehicle
{
	// 차량의 모델명과 가격에 대한 객체 변수를 선언한다
    // 여기에 코드를 입력하세요
	public String model;
	public int money;
	public double begi;
	// 차량의 모델명과 가격을 주어진 값으로 초기화하면서
	// 객체를 생성한다
    // 여기에 메소드를 입력하세요
	
	public Vehicle(String model,int money,int begi) {
		this.model=model;
		this.money=money;
		this.begi=begi;
	}
	
	// 차량의 모델을 반환한다
    // 여기에 메소드를 입력하세요
	public String modelName(String model) {
		return model;
	}
	
	// 차량의 가격을 반환한다
    // 여기에 메소드를 입력하세요
	public int Money(int money) {
		return money;
	}
	// 차량의 모델명과 가격을 반환한다
    // 여기에 메소드를 입력하세요

	public String modelNameMoney(String model, int money) {
		return "모델명: "+model+"돈 : "+money;
	}
	// 차량의 세금을 계산한다
    // 여기에 메소드를 입력하세요
	public abstract double taxPrice();
	
	
	// 차량의 모델을 주어진 값으로 변경한다
    // 여기에 메소드를 입력하세요
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// 차량의 가격을 주어진 값으로 변경한다
    // 여기에 메소드를 입력하세요
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public String modelNameMoney() {
		return "모델명: "+model+", 돈: "+money;
	}
}


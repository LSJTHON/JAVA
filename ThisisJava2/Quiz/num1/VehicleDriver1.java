package Quiz.num1;

public class VehicleDriver1 {

	public static void main(String[] args) {
			// 3,500 cc의 가격이 5,000 만원인 제네시스 승용차를 나타내는 Car 객체를 생성한다
	    	// 여기에 코드를 입력하세요
		
		Car car1 = new Car("제네시스",50000000,3500);
		// car1이 가리키는 객체의 모든 데이터를 출력한다.
	    	// 여기에 코드를 입력하세요

		System.out.println(car1.modelNameMoney());
		
		// car1이 가리키는 객체의 세금을 계산하여 출력한다
	    	// 여기에 코드를 입력하세요
	
		// 2,500 톤의 가격이 2,000 만원인 봉고 트럭을 나타내는 Truck 객체를 생성한다
	    	// 여기에 코드를 입력하세요
		Truck truck1 = new Truck("봉고"
				+ "",20000000,2500);
		System.out.println(truck1.modelNameMoney());
		// truck이 가리키는 객체의 모든 데이터를 출력한다
	    	// 여기에 코드를 입력하세요
	
		// truck이 가리키는 객체의 세금을 계산하여 출력한다
	    	// 여기에 코드를 입력하세요
		
		// 1,000 cc의 가격이 1,500 만원인 쏘울 승용차를 나타내는 Car 객체를 생성한다
	    	// 여기에 코드를 입력하세요
	
		// car2가 가리키는 객체의 모든 데이터를 출력한다
	    	// 여기에 코드를 입력하세요
	
		// car2가 가리키는 객체의 세금을 계산하여 출력한다
	    	// 여기에 코드를 입력하세요
	}

}

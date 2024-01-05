package ch07.sec05;

public class SuperCar extends Car{
	@Override
	public void speedUp() { //stop은 final로 지정했기 때문에 상속받지 못함.
		speed += 10;
	}

	
}

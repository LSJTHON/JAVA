package ch07.sec04;

public class SuperSonicAirplane extends AirPlane{ //자식 : 초음속 비행기
	public static final int NORMAL =1;  //일반비행
	public static final int SUPERSONIC = 2; //초음속 비행
	
	//상태 필드 선언
	public int flymode = NORMAL; //비행모드 : 일반비행

	@Override
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("미친 초음속 비행");
		}else {
			super.fly();  //부모가 가진 메소드의 코드 그대로 활용하겠다.
		}
	}
}

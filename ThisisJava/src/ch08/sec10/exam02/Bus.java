package ch08.sec10.exam02;

public class Bus implements Vehicle{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("낡은 버스가 비명지릅니다.");
	}
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}

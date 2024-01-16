package ch14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkObject workObject = new WorkObject();
		
		ThreadA tA = new ThreadA(workObject);
		ThreadB tB = new ThreadB(workObject);
		
		
		tA.start();
		tB.start();
	}

}

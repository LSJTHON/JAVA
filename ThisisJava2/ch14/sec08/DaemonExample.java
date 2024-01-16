package ch14.sec08;

public class DaemonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread aST = new AutoSaveThread();
		aST.setDaemon(true);
		aST.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");
	}

}

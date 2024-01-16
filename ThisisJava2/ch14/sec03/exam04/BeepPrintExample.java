package ch14.sec03.exam04;

public class BeepPrintExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName()+" 실행");
		
		
		for(int i =0;i<3;i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName()+" 실행");
				}
			};
			//threadA.setName("메인 스레드 입니다.");
			threadA.start();
		}
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName()+" 실행");
			}
		};
		chatThread.setName("챗 스레드 입니다.");
		chatThread.start();
	}

}

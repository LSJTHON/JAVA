package ch14.sec09.exam03;

import java.util.concurrent.*;

public class CallableSubmitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService eS = Executors.newFixedThreadPool(5);
		
		for(int i =0;i<=100;i++) {
			final int idx = i;
			Future<Integer> future = eS.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for(int i =0;i<=idx; i++) {
						sum += i;
					}
					Thread thread = Thread.currentThread();
					System.out.println("["+thread.getName()+"] 1~"+idx+" 합 계산");
					return sum;
				}
			});
			
			try {
				int result = future.get();
				System.out.println("\t 리턴값: "+result);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		eS.shutdown();
	}

}

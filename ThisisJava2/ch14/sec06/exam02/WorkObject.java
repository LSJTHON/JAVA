package ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" : methodA 작업실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {
		}
	}
	public synchronized void methodB() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" : methodB 작업실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {
		}
	}
}

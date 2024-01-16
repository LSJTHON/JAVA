package ch14.sec03.exam01;
import java.awt.Toolkit;

public class BeepPrintExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit  toolkit = Toolkit.getDefaultToolkit();
		for(int i =0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}catch(Exception e){	}
		}
		for(int i =0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e){	}
		}
		
	}

}

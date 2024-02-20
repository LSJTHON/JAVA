package sec02.exam02.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App extends Frame{

	public App() {
		//윈도우 제목 설정
		setTitle("AWT app");
		
		
		//윈도우 사이즈 설정
		setSize(300,1000);
		//버튼 추가 위치 SOUTH(남쪽) -기능은 아직 없음
		add(new Button("Ok"), BorderLayout.SOUTH);
		
		// 윈도우 종료 기능 - 프로세스 종료
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); //프로세스 종료
			}
		});
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.setVisible(true);
	}
	
}

package sec05.exam02_windowadapter;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ClosableExample2 extends JFrame{

	private JButton btnClose;
	
	public ClosableExample2 () {
		this.setTitle("CloseExample");
		this.setSize(300,100);
		
		this.setLayout(new FlowLayout());
		this.getContentPane().add(getBtnClose());
		
		// 리스너 추가 windowlistener 추가 익명 객체로 처리
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	private JButton getBtnClose() {
		if(btnClose == null) {
			btnClose = new JButton();
			btnClose.setText("닫기");
			
			//추가 익명 객체로 처리
			btnClose.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return btnClose;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ClosableExample2 jFrame = new ClosableExample2();
				jFrame.setVisible(true);
			}
		});
	}
}
package sec05.exam01_windowadapter;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ClosableExample1 extends JFrame{

	private JButton btnClose;
	
	public ClosableExample1 () {
		this.setTitle("CloseExample");
		this.setSize(300,100);
		
		this.setLayout(new FlowLayout());
		this.getContentPane().add(getBtnClose());
		
		this.addWindowListener(new MyWindowAdapter());
	}
	
	private JButton getBtnClose() {
		if(btnClose == null) {
			btnClose = new JButton();
			btnClose.setText("닫기");
			
			btnClose.addActionListener(new MyActionListener());
		}
		return btnClose;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ClosableExample1 jFrame = new ClosableExample1();
				jFrame.setVisible(true);
			}
		});
	}
}

class MyWindowAdapter extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
//인터페이스는 구현을 해줘야 한다.
class MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

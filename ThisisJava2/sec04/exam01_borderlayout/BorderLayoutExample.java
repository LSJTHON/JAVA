package sec04.exam01_borderlayout;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class BorderLayoutExample extends JFrame{

	private JTextField txtNorth;
	private JTextArea txtCenter;
	private JButton btnSouth;
	
	
	public BorderLayoutExample() {
		this.setTitle("BorderLayoutExample");
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(getTxtNorth(), BorderLayout.WEST);
		this.getContentPane().add(getTxtCenter(), BorderLayout.CENTER);
		this.getContentPane().add(getBtnSouth(), BorderLayout.EAST);
	}
	
	private JTextField getTxtNorth() {
		if(txtNorth == null) {
			txtNorth = new JTextField();
			txtNorth.setText("북쪽 컴포넌트");
			txtNorth.setBackground(Color.YELLOW);
		}
		return txtNorth;
	}
	
	private JTextArea getTxtCenter() {
		if(txtCenter == null) {
			txtCenter = new JTextArea();
			txtCenter.append("중앙 컴포넌트\n");
			txtCenter.append("동쪽 컴포넌트가 없으니 동족으로 확장\n");
			txtCenter.append("서쪽 컴포넌트가 없으니 서쪽으로 확장\n");
		}
		return txtCenter;
	}
	
	private JButton getBtnSouth() {
		if(btnSouth == null) {
			btnSouth = new JButton();
			btnSouth.setText("남쪽 컴포넌트");
		}
		return btnSouth;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				BorderLayoutExample jFrame = new BorderLayoutExample();
				jFrame.setVisible(true);
			}
		});
	}
}

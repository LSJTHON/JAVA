package sec04.exam03_jpanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import sec04.exam02_flowlayout.FlowLayoutExample;


public class JPanelExample extends JFrame{
	
	private JPanel panelSouth;
	private JButton btnOk;
	private JButton btnCancel;
	
	public JPanelExample() {
		this.setTitle("JPanelExample");
		this.setSize(250,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getPanelSouth(),BorderLayout.SOUTH);
	}
	
	public JPanel getPanelSouth() {
		if(panelSouth == null) {
			panelSouth = new JPanel();
			panelSouth.setBackground(Color.WHITE);
			panelSouth.add(getBtnOk());
			panelSouth.add(getBtnCancel());
		}
		return panelSouth;
	}
	public JButton getBtnOk() {
		if(btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("확인");
		}
		return btnOk;
	}
	public JButton getBtnCancel() {
		if(btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("취소");
		}
		return btnCancel;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JPanelExample jFrame = new JPanelExample();
				jFrame.setVisible(true);
			}
		});
	}
}

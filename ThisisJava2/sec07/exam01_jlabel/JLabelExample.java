package sec07.exam01_jlabel;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

public class JLabelExample extends JFrame{

	private JLabel jLabel1, jLabel2, jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8;
	
	public JLabelExample() {
		this.setTitle("레이블 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(1,8));
		
		this.getContentPane().add(getJLabel1());
		this.getContentPane().add(getJLabel2());
		this.getContentPane().add(getJLabel3());
		this.getContentPane().add(getJLabel4());
		this.getContentPane().add(getJLabel5());
		this.getContentPane().add(getJLabel6());
		this.getContentPane().add(getJLabel7());
		this.getContentPane().add(getJLabel8());
		this.setSize(200,300);
	}
	
	public JLabel getJLabel1() {
		if(jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("JLabel1");
			jLabel1.setHorizontalAlignment(JLabel.LEFT);
			jLabel1.setBorder(new EtchedBorder());
		}
		return jLabel1;
	}
	
	public JLabel getJLabel2() {
		if(jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("JLabel2");
			jLabel2.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel2.setHorizontalAlignment(JLabel.CENTER);
			jLabel2.setBorder(new EtchedBorder());
		}
		return jLabel2;
	}
	
	public JLabel getJLabel3() {
		if(jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("JLabel3");
			jLabel3.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel3.setHorizontalAlignment(JLabel.CENTER);
			jLabel3.setHorizontalTextPosition(JLabel.LEFT);
			jLabel3.setBorder(new EtchedBorder());
		}
		return jLabel3;
	}
	
	public JLabel getJLabel4() {
		if(jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("JLabel4");
			jLabel4.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel4.setHorizontalAlignment(JLabel.CENTER);
			jLabel4.setIconTextGap(20);
			jLabel4.setBorder(new EtchedBorder());
		}
		return jLabel4;
	}
	
	public JLabel getJLabel5() {
		if(jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("JLabel4");
			jLabel5.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel5.setHorizontalAlignment(JLabel.CENTER);
			jLabel5.setIconTextGap(20);
			jLabel5.setBorder(new EtchedBorder());
		}
		return jLabel5;
	}
	
	public JLabel getJLabel6() {
		if(jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("JLabel4");
			jLabel6.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel6.setHorizontalAlignment(JLabel.CENTER);
			jLabel6.setIconTextGap(20);
			jLabel6.setBorder(new EtchedBorder());
		}
		return jLabel6;
	}
	
	public JLabel getJLabel7() {
		if(jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("JLabel4");
			jLabel7.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel7.setHorizontalAlignment(JLabel.CENTER);
			jLabel7.setIconTextGap(20);
			jLabel7.setBorder(new EtchedBorder());
		}
		return jLabel7;
	}
	
	public JLabel getJLabel8() {
		if(jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("JLabel4");
			jLabel8.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel8.setHorizontalAlignment(JLabel.LEFT);
			jLabel8.setIconTextGap(20);
			jLabel8.setBorder(new EtchedBorder());
		}
		return jLabel8;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JLabelExample jFrame = new JLabelExample();
				jFrame.setVisible(true);
			}
		});
	}
}

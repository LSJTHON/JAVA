package sec06.exam03_jradiobutton;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

import sec06.exam02_jtogglebutton.JToggleButtonExample;



public class JRadioButtonExample extends JFrame{
	
	private JPanel radioPanel;
	private JRadioButton rbBird;
	private JRadioButton rbCat,rbs1,rbs2;
	private JLabel lblPicture;
	
	
	public JRadioButtonExample() {
		setTitle("라디오 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getRadioPanel(),BorderLayout.SOUTH);
		this.getContentPane().add(getLblPicture(),BorderLayout.CENTER);
		pack();
	}
	
	public JPanel getRadioPanel() {
		if(radioPanel == null) {
			radioPanel = new JPanel();
			//라디오 버튼을 2행 1열로 설정하겠다
			radioPanel.setLayout(new FlowLayout());
			radioPanel.add(getRbBird());
			radioPanel.add(getRbCat());
			radioPanel.add(getRbs1());
			radioPanel.add(getRbs2());
			
			ButtonGroup group = new ButtonGroup();
			group.add(getRbBird());
			group.add(getRbCat()); //getRbBird와 getRbBird 버튼을 그룹으로 묶곘다
			group.add(getRbs1());
			group.add(getRbs2());
		}
		return radioPanel;
	}
	
	public JRadioButton getRbBird() {
		if(rbBird == null) {
			rbBird = new JRadioButton();
			rbBird.setText("Attack!");
			rbBird.setSelected(true); //라디오 버튼의 기본 선택지 설정
			rbBird.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().getResource("Bird2.jpg")));
					JOptionPane.showMessageDialog(JRadioButtonExample.this, "우지끈");
					System.out.println("우지끈");
				}
			});
		}
		return rbBird;
	}
	
	public JRadioButton getRbCat() {
		if(rbCat == null) {
			rbCat = new JRadioButton();
			rbCat.setText("Hello?");
			rbCat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().getResource("Cat2.jpg")));
					JOptionPane.showMessageDialog(JRadioButtonExample.this, "안녕?");
					System.out.println("안녕?");
				}
			});
		}
		return rbCat;
	}
	
	public JLabel getLblPicture() {
		if(lblPicture == null) {
			lblPicture = new JLabel();
			lblPicture.setIcon(new ImageIcon(getClass().getResource("Bird2.jpg")));
		}
		return lblPicture;
	}
	
	public JRadioButton getRbs1() {
		if(rbs1 == null) {
			rbs1 = new JRadioButton();
			rbs1.setText("s1");
			rbs1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().getResource("Cat.gif")));
					JOptionPane.showMessageDialog(JRadioButtonExample.this, "야옹");
					System.out.println("야옹");
				}
			});
		}
		return rbs1;
	}
	
	public JRadioButton getRbs2() {
		if(rbs2 == null) {
			rbs2 = new JRadioButton();
			rbs2.setText("s2");
			rbs2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().getResource("s2.jpg")));
					JOptionPane.showMessageDialog(JRadioButtonExample.this, "죽는다");
					System.out.println("죽는다");
				}
			});
		}
		return rbs2;
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JRadioButtonExample jFrame = new JRadioButtonExample();
				jFrame.setVisible(true);
			}
		});
	}
}

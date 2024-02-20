package sec06.exam04_jcheckbox;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JCheckBoxExample extends JFrame{

	private JPanel pWest;
	private JCheckBox cbGlasses;
	private JCheckBox cbHair;
	private JLabel lblPicture;
	
	public JCheckBoxExample() {
		this.setTitle("체크박스 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getPWest(), BorderLayout.WEST);
		this.getContentPane().add(getLblPicture(), BorderLayout.CENTER);
		this.pack();
	}
	
	public JPanel getPWest() {
		if(pWest == null) {
			pWest = new JPanel(new GridLayout(2,1));
			pWest.add(getCbGlasses());
			pWest.add(getCbHair());
		}
		return pWest;
	}
	
	public JCheckBox getCbGlasses() {
		if(cbGlasses == null) {
			cbGlasses = new JCheckBox();
			cbGlasses.setText("Glasses");
			cbGlasses.addActionListener(actionListener);
		}
		return cbGlasses;
	}
	
	public JCheckBox getCbHair() {
		if(cbHair == null) {
			cbHair = new JCheckBox();
			cbHair.setText("Hair");
			cbHair.addActionListener(actionListener);
		}
		return cbHair;
	}
	
	
	public JLabel getLblPicture() {
		if(lblPicture == null) {
			lblPicture = new JLabel();
			lblPicture.setIcon(new ImageIcon(getClass().getResource("geek.gif")));
		}
		return lblPicture;
	}
	
	private ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(cbGlasses.isSelected() && cbHair.isSelected()) {
				lblPicture.setIcon(new ImageIcon(getClass().getResource("geek-glasses-hair.gif")));
			}else if(cbGlasses.isSelected()) {
				lblPicture.setIcon(new ImageIcon(getClass().getResource("geek-glasses.gif")));
			}else if(cbHair.isSelected()) {
				lblPicture.setIcon(new ImageIcon(getClass().getResource("geek-hair.gif")));
			}else {
				lblPicture.setIcon(new ImageIcon(getClass().getResource("geek.gif")));
			}
		}
	};
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JCheckBoxExample jFrame = new JCheckBoxExample();
				jFrame.setVisible(true);
			}
		});
	}
}

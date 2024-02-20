package sec03.exam05_jscrollpane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class JScrollPaneExample extends JFrame{
	private JScrollPane scrollImage;
	private JLabel lblImage;
	
	public JScrollPaneExample() {
		this.setTitle("JScrollPaneExample");
		this.setSize(350,230);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(getScrollImage(),BorderLayout.CENTER);
	}
	
	private JScrollPane getScrollImage() {
		if(scrollImage == null) {
			scrollImage = new JScrollPane(getLblImage());
		}
		return scrollImage;
	}
	
	public JLabel getLblImage() {
		if(lblImage ==null) {
			lblImage = new JLabel();
			lblImage.setIcon(new ImageIcon(getClass().getResource("snow.jpg")));
		}
		return lblImage;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JScrollPaneExample jFrame = new JScrollPaneExample();
				jFrame.setVisible(true);
			}
		});
	}
}

package sec03.exam02_jwindow;


import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

public class JwindowExample extends JWindow{

	public JwindowExample() {
		this.setSize(430,350);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Point centerPoint = ge.getCenterPoint();
		int leftTopX = centerPoint.x - this.getWidth()/2;
		int leftTopY = centerPoint.y - this.getHeight()/2;
		this.setLocation(leftTopX,leftTopY);		
		
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(getClass().getResource("snow.jpg")));
		getContentPane().add(label,BorderLayout.CENTER);
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JwindowExample jwindow = new JwindowExample();
				jwindow.setVisible(true);
			}
		});
	}
}

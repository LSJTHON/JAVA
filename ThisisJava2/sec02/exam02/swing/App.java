package sec02.exam02.swing;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class App extends JFrame {
	public App() {
		setTitle("Swing App");

		setSize(300, 100);
		
		getContentPane().add(new JButton("Ok"), BorderLayout.SOUTH);
		
		getContentPane().add(new JButton("열심히 하시잖아. 한잔해"), BorderLayout.NORTH);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		App app = new App();
		
		app.setVisible(true);
	}
}
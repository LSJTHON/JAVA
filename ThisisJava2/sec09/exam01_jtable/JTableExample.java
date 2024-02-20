package sec09.exam01_jtable;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class JTableExample extends JFrame{

	private JTable jTable;
	
	public JTableExample() {
		this.setTitle("J테이블");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getJTable()),
					BorderLayout.CENTER);
		this.setSize(200,125);
	}
	
	public JTable getJTable() {
		if(jTable == null) {
			String[] columnNames = {"이름","나이"};
			Object[][] rowData = {
					{"춘삼월",21},
					{"춘삼월",22},
					{"춘삼월",23},
					{"춘삼월",24},
					{"춘삼월",25},
					{"춘삼월",26},
			};
			jTable = new JTable(rowData,columnNames);
			jTable.getColumn("이름").setPreferredWidth(100);
			jTable.getColumn("나이").setPreferredWidth(50);
		}
		return jTable;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTableExample jFrame = new JTableExample();
				jFrame.setVisible(true);
			}
		});
	}
}

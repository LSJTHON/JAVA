package sec09.exam02_tablemodel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableModel;

public class JTableExample extends JFrame {

	private JTable jTable;
	private JButton btnInfo;

	public JTableExample() {
		this.setTitle("JTableExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getJTable()), BorderLayout.CENTER);
		this.getContentPane().add(getBtnInfo(),BorderLayout.SOUTH);
		this.setSize(200, 200);
	}

	public JTable getJTable() {
		if (jTable == null) {
			String[] columnNames = { "이름", "나이" };
			Object[][] rowData = { { "춘삼월", 25 }, { "하여름", 23 } };
			jTable = new JTable(rowData, columnNames);
		}
		return jTable;
	}

	public JButton getBtnInfo() {
		if (btnInfo == null) {
			btnInfo = new JButton();
			btnInfo.setText("테이블 정보 출력");
			btnInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TableModel tableModel = getJTable().getModel();
					int columnCount = tableModel.getColumnCount();
					int rowCount = tableModel.getRowCount();

					for (int i = 0; i < columnCount; i++) {
						String columnName = tableModel.getColumnName(i);
						System.out.println(columnName + "\t\t");
					}
					System.out.println();
					System.out.println("-----------------------------");

					for (int i = 0; i < rowCount; i++) {
						String column0 = (String) tableModel.getValueAt(i, 0);
						Integer column1 = (Integer) tableModel.getValueAt(i, 1);
						System.out.println(column0 + "\t\t" + column1);
					}
					tableModel.setValueAt("개나리", 0, 0);
					tableModel.setValueAt(20, 0, 1);
				}
			});
		}
		return btnInfo;
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

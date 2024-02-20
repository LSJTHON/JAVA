package sec09.exam04_eventhandling;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.TableModel;


public class JTableExample extends JFrame{

	private JTable jTable;
	private JPanel pSouth;
	private JTextField txtName;
	private JTextField txt;
	private String a;
	private JTextField txtAge;
	private Object[][] rowData;
	
	public JTableExample() {
		this.setTitle("JTableExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getJTable()),
				BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(""), BorderLayout.SOUTH);
		this.setSize(200,230);
	}
	
	public JTable getJTable() {
		if(jTable == null) {
			String[] columnNames = new String[] {"이름","번호"};
			rowData = new Object[][] {
				{"이성종", 1},
				{"백민규", 2},
				{"신지원", 3},
				{"박진호", 4},
				{"임성훈", 5},
				{"최종민", 6},
				{"신종현", 7},
				{"전찬용", 8},
				{"이창현", 9},
				{"최형석", 10},
			};
			jTable = new JTable(rowData, columnNames);
			
			jTable.addMouseListener(new MouseAdapter() { //테이블에 마우스리스너로 처리
				public void mouseClicked(MouseEvent e) { //마우스 클릭 이벤트
					int rowIndex = jTable.getSelectedRow(); //row의 index값을 가져온다
					int colIndex = jTable.getSelectedColumn(); // col의 index값을 가져온다.
					if(rowIndex != -1 && colIndex != -1) {
						TableModel tableModel = jTable.getModel();
						if(colIndex == 0) { // 0번째 열을 클릭했을 시 
							String name = (String) tableModel.getValueAt(rowIndex,colIndex);
							getTxt().setText(name);
							getPSouth("이름 : ");
						}else {
							Integer age = (Integer) tableModel.getValueAt(rowIndex,colIndex);
							getTxt().setText(String.valueOf(age.intValue()));
							getPSouth("나이 : ");
						}	
					}
				}
			});
		}
		return jTable;
	}
	
	public JPanel getPSouth(String a) {
		if(pSouth == null) {
			pSouth = new JPanel();
			pSouth.setLayout(new GridLayout(3,2));
			pSouth.add(new JLabel("[선택한 행 정보]"));
			pSouth.add(new JLabel(""));
			pSouth.add(new JLabel(a,JLabel.CENTER));
			pSouth.add(getTxt());
		}
		return pSouth;
	}

	public JTextField getTxt() {
		if(txt ==null) {
			txt = new JTextField();
		}
		return txt;
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

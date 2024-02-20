package sec07.exam03_jtextarea;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;



public class JTextAreaExample extends JFrame{

	private JTextArea txtDisplay;
	private JPanel pSouth;
	private JTextField txtInput;
	private JButton btnSend;
	
	public JTextAreaExample() {
		this.setTitle("텍스트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getTxtDisplay()),
					BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(),BorderLayout.SOUTH);
		this.setSize(300,200);
	}
	
	public JTextArea getTxtDisplay() {
		if(txtDisplay == null) {
			txtDisplay = new JTextArea();
			txtDisplay.setEditable(false);
		}
		return txtDisplay;
	}
	
	public JPanel getPSouth() {
		if(pSouth == null) {
			pSouth = new JPanel();
			pSouth.setLayout(new BorderLayout());
			pSouth.add(getTxtInput(), BorderLayout.CENTER);
			pSouth.add(getBtnSend(), BorderLayout.EAST);
		}
		return pSouth;
	}
	
	public JTextField getTxtInput() {
		if(txtInput == null) {
			txtInput = new JTextField();
		}
		return txtInput;
	}
	
	public JButton getBtnSend() {
		if(btnSend == null) {
			btnSend = new JButton();
			btnSend.setText("전송");
			btnSend.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//전송 버튼 클릭 시 위쪽에 있는 textarea 에 textfield 값을 가져와서 추가한다.
					//textfield 값을 초기화 ("")
					getTxtDisplay().append(getTxtInput().getText()+"\n");
					getTxtInput().setText("");
				}
			});
		}
		return btnSend;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTextAreaExample jFrame = new JTextAreaExample();
				jFrame.setVisible(true);
			}
		});
	}
}

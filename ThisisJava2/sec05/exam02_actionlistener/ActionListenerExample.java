package sec05.exam02_actionlistener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class ActionListenerExample extends JFrame{

	private JButton btnOk;
	private JButton btnCancel;
	
	public ActionListenerExample() {
		this.setTitle("ActionListenerExample");
		this.setSize(300,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		this.getContentPane().add(getBtnOk());
		this.getContentPane().add(getBtnCancel());
	}
	
	
	private ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnOk) {
				System.out.println("확인 버튼 클릭");
			}else if(e.getSource() == btnCancel) {
				System.out.println("취소 버튼 클릭");
			}
		}
	};
	
	private JButton getBtnOk() {
		if(btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("확인");
			
			btnOk.addActionListener(actionListener);
		}
		return btnOk;
	}
	private JButton getBtnCancel() {
		if(btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("취소");
			
			btnCancel.addActionListener(actionListener);
		}
		return btnCancel;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ActionListenerExample jFrame = new ActionListenerExample();
				jFrame.setVisible(true);
			}
		});
	}
}

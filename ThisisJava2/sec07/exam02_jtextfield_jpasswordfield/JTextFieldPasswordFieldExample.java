package sec07.exam02_jtextfield_jpasswordfield;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class JTextFieldPasswordFieldExample extends JFrame{

	private JTextField txtId;
	private JPasswordField txtPassword;
	
	
	public String checkId = "winter";
	public String checkPassword = "12345";
	
	public JTextFieldPasswordFieldExample() {
		this.setTitle("예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(2,2));
		this.getContentPane().add(new JLabel("아이디",JLabel.CENTER));
		this.getContentPane().add(getTxtId());
		this.getContentPane().add(new JLabel("패스워드",JLabel.CENTER));
		this.getContentPane().add(getTxtPassword());
		this.setSize(200,100);
	}
	
	public JTextField getTxtId() {
		if(txtId == null) {
			txtId = new JTextField();
			txtId.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					String id = txtId.getText();
					if(e.getKeyCode() >= KeyEvent.VK_A && e.getKeyCode() <= KeyEvent.VK_Z) {
						if(id.equals(checkId)) {
							JOptionPane.showMessageDialog(
									JTextFieldPasswordFieldExample.this,"아이디가 맞아용");
							
							//키 이벤트에 엔터를 찾으시오
						}else {
							JOptionPane.showMessageDialog(
									JTextFieldPasswordFieldExample.this,"아이디가 틀려용");
						}
					}else {
						JOptionPane.showMessageDialog(
								JTextFieldPasswordFieldExample.this,"영어를 입력하라 이말입니다.");
					}
				}
			});
		}
		return txtId;
	}
	
	public JPasswordField getTxtPassword() {
		if(txtPassword == null) {
			txtPassword = new JPasswordField();
			txtPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String password = new String(txtPassword.getPassword());
					if(checkPassword.equals(password)) {
						JOptionPane.showMessageDialog(
								JTextFieldPasswordFieldExample.this,"패스워드가 일치합니다.");
					}else {
						JOptionPane.showMessageDialog(
								JTextFieldPasswordFieldExample.this,"패스워드가 일치하지 않잖아!! 다시.");
					}
				}
			});
		}
		return txtPassword;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			JTextFieldPasswordFieldExample jFrame = new JTextFieldPasswordFieldExample();
			jFrame.setVisible(true);
			}
		});
	}
}

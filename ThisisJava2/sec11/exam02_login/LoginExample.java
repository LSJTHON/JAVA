package sec11.exam02_login;


import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


import sec11.exam01_jmenu2.JMenuExample;


public class LoginExample extends JFrame{
	private Connection conn;
	private JTextField txtId;
	private JPasswordField txtPs;
	private JButton btnClose,btnLogin;
	public LoginExample() {
		this.setTitle("로그인");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(3,2));
		this.getContentPane().add(new JLabel("아이디",JLabel.CENTER));
		this.getContentPane().add(getId());
		this.getContentPane().add(new JLabel("비번",JLabel.CENTER));
		this.getContentPane().add(getPs());
		
		this.getContentPane().add(getBtnLogin());
		this.getContentPane().add(getBtnClose());
		
		this.setSize(400,300);
		
		Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);
	}
	
	private JButton getBtnClose() {
		if(btnClose == null) {
			btnClose = new JButton();
			btnClose.setText("닫기");
			
			btnClose.addActionListener(new MyActionListener());
		}
		
		return btnClose;
	}
	
	private JButton getBtnLogin() {
		if(btnLogin == null) {
			btnLogin = new JButton();
			btnLogin.setText("로그인");
			
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String id = new String(txtId.getText());
					String ps = new String(txtPs.getPassword());
					JOptionPane.showMessageDialog(LoginExample.this, "입력한 아이디: "+ id + "\n" + "비번: "+ps);
					data(id,ps);
				}
			});
		}
		return btnLogin;
	}
	
	public JTextField getId() {
		if(txtId == null) {
			txtId = new JTextField();
			txtId.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String id = new String(txtId.getText());
					JOptionPane.showMessageDialog(LoginExample.this, "입력한 아이디: "+ id);
				}
			});
		}
		return txtId;
	}
	
	public JTextField getPs() {
		if(txtPs == null) {
			txtPs = new JPasswordField();
			txtPs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String ps = new String(txtPs.getPassword());
					JOptionPane.showMessageDialog(LoginExample.this, "입력한 패스워드: "+ ps);
				}
			});
		}
		return txtPs;
	}
	
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	class MyWoindowAdapter extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginExample jFrame = new LoginExample();
				jFrame.setVisible(true);
			}
		});
	}
	
	private void data(String id, String ps) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
						"jdbc:mysql://192.168.111.200:3306/thisisjava",
						"java",
						"mysql"
					);
			String sql = ""+
					"select userid , userpassword, username "+
					"from users "+
					"where userid=?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				String dbUserPassword = rs.getString("userpassword");
				String userName = rs.getString("username");
				if(ps.equals(dbUserPassword)) {
					System.out.println("로그인 성공했습니다.");
					JOptionPane.showMessageDialog(LoginExample.this, "로그인 성공 했습니다! "+ userName +"님");
					JMenuExample jFrame2 = new JMenuExample();
					jFrame2.setVisible(true);
					dispose();
				}else {
					System.out.println("비밀번호가 다릅니다.");
				}
			}else {
				System.out.println("사용자가 없습니다.");
				
			}
			rs.close();
			pstmt.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {}
			}
		}
	}
}

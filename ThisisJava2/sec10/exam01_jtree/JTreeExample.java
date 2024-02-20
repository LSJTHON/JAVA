package sec10.exam01_jtree;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample extends JFrame{
	
	private JTree jTree;
	
	public JTreeExample() {
		this.setTitle("트리 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getJTree()),
				BorderLayout.CENTER);
		this.setSize(300,250);
		Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);
	}
	
	public JTree getJTree() {
		if(jTree == null) {
			//트리 생성 전에 트리구조에 대한 데이터 필요
			DefaultMutableTreeNode root = new DefaultMutableTreeNode("그룹리스트");
			
			DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("친구");
			node1.add(new DefaultMutableTreeNode("친구1"));
			node1.add(new DefaultMutableTreeNode("친구2"));
			root.add(node1);
			
			DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("회사 동료");
			node2.add(new DefaultMutableTreeNode("동료1"));
			node2.add(new DefaultMutableTreeNode("동료2"));
			root.add(node2);
			
			jTree = new JTree(root);
			}
		return jTree;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTreeExample jFrame = new JTreeExample();
				jFrame.setVisible(true);
				
			}
		});
	}
}

package sec10.exam02_cellrenderer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

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
			jTree.setCellRenderer(new MyTreeCellRenderer());
			}
		return jTree;
	}
	
	public class MyTreeCellRenderer implements TreeCellRenderer{
		public Component getTreeCellRendererComponent(
				JTree tree,Object value, boolean sel, boolean expanded,
				boolean leaf, int row, boolean hasFocus) {
			if(!leaf) {
				JLabel jLabel = new JLabel();
				jLabel.setBorder(BorderFactory.createEmptyBorder(5,0,5,0));
				jLabel.setIcon(new ImageIcon(getClass().getResource("parentnode.gif")));
				jLabel.setText(value.toString());
				return jLabel;
			}else {
				JPanel jPanel = new JPanel();
				jPanel.setBackground(Color.WHITE);
				jPanel.setLayout(new BorderLayout());
				jPanel.setBorder(BorderFactory.createEmptyBorder(3,0,3,0));
				
				JLabel lblWest = new JLabel(new ImageIcon(getClass().
						getResource("logon.gif")));
				JLabel lblCenter = new JLabel("  "+value.toString()+"  ");
				JLabel lblEast = new JLabel(new ImageIcon(getClass()
						.getResource("time.gif")));
				jPanel.add(lblWest, BorderLayout.WEST);
				jPanel.add(lblCenter, BorderLayout.CENTER);
				jPanel.add(lblEast, BorderLayout.EAST);
				
				if(sel) {
					jPanel.setBackground(Color.ORANGE);
				}
				return jPanel;
			}
		}
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



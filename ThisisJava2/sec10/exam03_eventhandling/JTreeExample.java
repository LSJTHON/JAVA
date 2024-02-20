package sec10.exam03_eventhandling;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;

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
			DefaultMutableTreeNode root = new DefaultMutableTreeNode("살생부 명단");
			
			DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("즉결 처형");
			node1.add(new DefaultMutableTreeNode("박진호"));
			node1.add(new DefaultMutableTreeNode("최종민"));
			root.add(node1);
			
			DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("집행 유예");
			node2.add(new DefaultMutableTreeNode("임성훈"));
			node2.add(new DefaultMutableTreeNode("신종현"));
			root.add(node2);
			
			jTree = new JTree(root);
			jTree.setCellRenderer(new MyTreeCellRenderer());
			jTree.addTreeSelectionListener(treeSelectionListener);
			jTree.addMouseListener(mouseListener);
			}
		return jTree;
	}
	
	private TreeSelectionListener treeSelectionListener = 
			new TreeSelectionListener() {
		@Override
		public void valueChanged(TreeSelectionEvent e) {
		TreePath treePath = e.getPath(); //root 부터 선택한 노드 까지의 전체 경로
		DefaultMutableTreeNode treeNode = 
				(DefaultMutableTreeNode) treePath.getLastPathComponent();
		String nodeText = (String)treeNode.getUserObject(); //마지막 노드에 담긴 값
		JOptionPane.showMessageDialog(JTreeExample.this, "노드 변경: "+
				nodeText);
		}
	};
	private MouseListener mouseListener = new MouseAdapter() {
		public void mouseClicked(java.awt.event.MouseEvent e) {
			//더블클릭
			if(e.getClickCount() == 2) {
				//마우스 더블 클릭한 전체 경로
				TreePath treePath = jTree.getPathForLocation(e.getX(),e.getY());
				// 전체 경로중 마지막 경로
				DefaultMutableTreeNode treeNode = 
						(DefaultMutableTreeNode) treePath.getLastPathComponent();
				String nodeText = (String)treeNode.getUserObject();
				JOptionPane.showMessageDialog(JTreeExample.this, "더블 클릭: "+
						nodeText);
			}
		}
	};
	
	
	
	public class MyTreeCellRenderer implements TreeCellRenderer{
		public Component getTreeCellRendererComponent(
				JTree tree,Object value, boolean sel, boolean expanded,
				boolean leaf, int row, boolean hasFocus) {
			if(!leaf) {
				// 리프가 아니라면 (하위 경로가 있는 경우 : root, 부모노드 일때)
				JLabel jLabel = new JLabel();
				jLabel.setBorder(BorderFactory.createEmptyBorder(5,0,5,0));
				jLabel.setIcon(new ImageIcon(getClass().getResource("parentnode.gif")));
				jLabel.setText(value.toString());
				return jLabel;
			}else {
				JPanel jPanel = new JPanel();
				jPanel.setBackground(Color.WHITE);
				jPanel.setLayout(new BorderLayout());
				//노드 간에 상하 간격
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

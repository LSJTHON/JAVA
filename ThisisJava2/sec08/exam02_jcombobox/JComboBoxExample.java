package sec08.exam02_jcombobox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JComboBoxExample extends JFrame{

	private JPanel pNorth;
	private JComboBox comboString;
	private JComboBox comboImage;
	private JLabel jLabel;
	
	public JComboBoxExample() {
		this.setTitle("콤보박스 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().add(getPNorth(), BorderLayout.NORTH);
		this.getContentPane().add(getJLabel(), BorderLayout.CENTER);
		this.setSize(250,200);
	}
	
	public JPanel getPNorth() {
		if(pNorth == null) {
			pNorth = new JPanel();
			pNorth.add(getComboString());
			pNorth.add(getComboImage());
		}
		return pNorth;
	}
	
	public JComboBox getComboString() {
		if(comboString == null) {
			String[] arrString = {
					"Cantaloupe", "Grapefruit", "Grapes", "Kiwi", "Peach",
					"pineapple", "strawberry", "tomato", "watermelon"};
			comboString = new JComboBox(arrString);
			comboString.setBackground(Color.WHITE);
			comboString.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int selectedIndex = comboString.getSelectedIndex();
					ImageIcon image = new ImageIcon(
							getClass().getResource("fruit"+(selectedIndex+1)+".jpg"));
					getJLabel().setIcon(image);
				}
			});
		}
		return comboString;
	}
	
	public JComboBox getComboImage() {
		if(comboImage == null) {
			Vector vImage = new Vector();
			for(int i =1;i<10;i++) {
				ImageIcon image = new ImageIcon(
						getClass().getResource("fruit"+i+".jpg"));
				vImage.add(image);
			}
			comboImage = new JComboBox(vImage);
			comboImage.setBackground(Color.WHITE);
			comboImage.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ImageIcon image = (ImageIcon) comboImage.getSelectedItem();
					getJLabel().setIcon(image);
				}
			});
		}
		return comboImage;
	}
	
	public JLabel getJLabel() {
		if(jLabel == null) {
			jLabel = new JLabel();
			jLabel.setHorizontalAlignment(JLabel.CENTER);
		}
		return jLabel;	
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JComboBoxExample jFrame = new JComboBoxExample();
				jFrame.setVisible(true);
			}
		});
	}
}

package sec11.exam02_login;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;

public class JMenuExample extends JFrame{

	private JMenuBar jMenuBar;
	private JMenu menuFile, menuPage;
	private JMenuItem menuItemNewFile,menuRename;
	private JMenuItem menuCopyFile, menuDelete, menuProjectInfo,menuBaseSize
				,menuShareOption, menuExit;
	
	public JMenuExample() {
		this.setTitle("JMenuExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(getJMenuBar());
		this.setSize(300,200);
		
		Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);
	}
	
	public JMenuBar getJMenuBar() {
		if(jMenuBar == null) {
			jMenuBar = new JMenuBar();
			//메뉴 추가
			jMenuBar.add(getMenuFile());
			jMenuBar.add(getMenuHelp());
			jMenuBar.add(getMenuHelp());
			jMenuBar.add(new JMenu("편집"));
			jMenuBar.add(new JMenu("정렬"));
			jMenuBar.add(new JMenu("효과"));
		}
		return jMenuBar;
	}
	
	public JMenu getMenuFile() {
		if(menuFile == null) {
			menuFile = new JMenu("프로젝트");
			menuFile.add(getMenuRename());
			menuFile.add(getMenuCopyFile());
			menuFile.add(getMenuDelete());
			menuFile.add(new JSeparator());
			menuFile.add(getMenuProjectInfo());
			menuFile.add(getMenuBaseSize());
			menuFile.add(getMenuShareOption());
			menuFile.add(new JSeparator());
			menuFile.add(getMenuExit());
		}
		return menuFile;
	}
	
	public JMenu getMenuHelp() {
		if(menuPage == null) {
			menuPage = new JMenu("페이지");
			menuPage.add(new JMenuItem("새 페이지 삽입"));
			menuPage.add(new JSeparator());
			menuPage.add(new JMenuItem("모두 저장하기",new ImageIcon(getClass().getResource("open.gif"))));
			menuPage.add(new JSeparator());
			menuPage.add(new JMenuItem("페이지 복제"));
			menuPage.add(new JMenuItem("페이지 삭제"));
			menuPage.add(new JMenuItem("페이지 이름 바꾸기"));
			menuPage.add(new JSeparator());
			menuPage.add(new JMenuItem("페이지 내려받기"));
			menuPage.add(new JMenuItem("전체 페이지 내려받기",new ImageIcon(getClass().getResource("open.gif"))));
			menuPage.add(new JSeparator());
			menuPage.add(new JMenuItem("웹 테스트",new ImageIcon(getClass().getResource("open.gif"))));
			
		}
		return menuPage;
	}
	
	public JMenuItem getMenuRename() {
		if(menuRename == null) {
			menuRename = new JMenuItem("이름 바꾸기");
		}
		return menuRename;
	}
	
	public JMenuItem getMenuItemFile() {
		if(menuItemNewFile == null) {
			menuItemNewFile = new JMenuItem("새 파일");
		}
		return menuItemNewFile;
	}
	
	public JMenuItem getMenuCopyFile() {
		if(menuCopyFile == null) {
			menuCopyFile = new JMenuItem("사본 만들기",
					new ImageIcon(getClass().getResource("open.gif")));
		}
		
		return menuCopyFile;
	}
	
	public JMenuItem getMenuDelete() {
		if(menuDelete == null) {
			menuDelete = new JMenu("삭제 하기");
			menuDelete.add(new JMenuItem("이 프로젝트를 삭제"));
		}
		return menuDelete;
	}
	public JMenuItem getMenuProjectInfo() {
		if(menuProjectInfo == null) {
			menuProjectInfo = new JMenuItem("프로젝트 정보 설정");
		}
		return menuProjectInfo;
	}
	
	public JMenuItem getMenuBaseSize() {
		if(menuBaseSize == null) {
			menuBaseSize = new JMenuItem("기본 화면 사이즈",
					new ImageIcon(getClass().getResource("open.gif")));
		}
		
		return menuBaseSize;
	}
	
	public JMenuItem getMenuShareOption() {
		if(menuShareOption == null) {
			menuShareOption = new JMenuItem("공유 옵션");
		}
		return menuShareOption;
	}
	
	public JMenuItem getMenuExit() {
		if(menuExit == null) {
			menuExit = new JMenuItem("닫기");
		}
		return menuExit;
	}
}
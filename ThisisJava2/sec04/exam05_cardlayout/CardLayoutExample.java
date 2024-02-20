package sec04.exam05_cardlayout;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CardLayoutExample extends JFrame{

	private JPanel redCard, greenCard, blueCard;
	
	public CardLayoutExample() { //메인 윈도우 설정
		this.setTitle("CardLayoutExample"); //제목 설정
		this.setSize(250,400); //사이즈 설정
		this.setResizable(false); //카드에 대한 크기 조정 불가능하시 만듬
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로세스 종료가 가능하게 만듬
	
		this.getContentPane().setLayout(new CardLayout()); //J프레임 콘텐츠부분이 카드레이아웃으로 바꿈
		this.getContentPane().add("RedCard",getRedCard()); //컨텐츠 패널에 redcard메소드를 추가하겠다.
		this.getContentPane().add("GreedCard",getGreenCard());
		this.getContentPane().add("BlueCard",getBlueCard());
	}
	
	public JPanel getRedCard() {
		if(redCard == null) { //redcard가 null이면 색깔을 지정
			redCard = new JPanel();
			redCard.setBackground(Color.RED);
		}
		return redCard;
	}
	public JPanel getGreenCard() {
		if(greenCard == null) {
			greenCard = new JPanel();
			greenCard.setBackground(Color.GREEN);
		}
		return greenCard;
	}
	public JPanel getBlueCard() {
		if(blueCard == null) {
			blueCard = new JPanel();
			blueCard.setBackground(Color.BLUE);
		}
		return blueCard;
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				final CardLayoutExample jFrame = new CardLayoutExample();
				jFrame.setVisible(true);
				Thread thread = new Thread() {
					@Override
					public void run() {
						for(int i =0;i<10;i++) {
							try {
								Thread.sleep(1000);
							}catch(InterruptedException e) {}
							SwingUtilities.invokeLater(new Runnable() {
								@Override
								public void run() {
									//CardLayout을 얻어 다음 카드 보여주기
									CardLayout cardLayout =
											(CardLayout) jFrame.getContentPane().getLayout();
									cardLayout.next(jFrame.getContentPane());
								}
							});
						}
					}
				};
				thread.start();
			}
		});
	}
}

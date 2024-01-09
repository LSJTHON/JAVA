package ch09.sec06.exam03;

public class Button {
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clicklistener;
	
	public void setClikListener(ClickListener clickListener) {
		this.clicklistener = clickListener;
	}
	
	public void click() {
		this.clicklistener.onClick();
	}
}

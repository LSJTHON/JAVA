package ch09.sec06.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("OK 버튼 클릭했습니다.");
			}
		}
		
		btnOk.setClikListener(new OkListener());
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		btnCancel.setClikListener(new CancelListener());
		
		btnCancel.click();
	}

}

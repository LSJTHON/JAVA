package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button();
		
		btn.setClickListener(()-> System.out.println("ok 버튼을 클릭함."));

		btn.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(()-> System.out.println("Cancel버튼을 클릭함"));
		
		btnCancel.click();
	}

}

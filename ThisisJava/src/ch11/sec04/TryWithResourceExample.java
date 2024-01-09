package ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(MyResources res = new MyResources("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("예외 처리: "+e.getMessage());
		}
		
		System.out.println();
		
		try(MyResources res = new MyResources("A")) {
			String data = res.read2();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("예외 처리: "+e.getMessage());
		}
		
		System.out.println();
		
		MyResources res1 = new MyResources("A");
		MyResources res2 = new MyResources("B");		
		try(res1; res2){
			String data1 = res1.read1();
			String data2 = res2.read2();
		}catch(Exception e) {
			System.out.println("예외 처리: "+e.getMessage());
		}
	}

}

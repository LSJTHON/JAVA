package ch11.sec05;

public class ThrowsExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("예외처리: "+e.getMessage());
		}
	}
		public static void findClass() throws ClassNotFoundException{
			Class.forName("java.lang.String2");
		}
	}


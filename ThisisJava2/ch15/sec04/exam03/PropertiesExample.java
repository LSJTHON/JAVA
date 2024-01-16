package ch15.sec04.exam03;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		Properties pt = new Properties();
		
		pt.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		
		String driver = pt.getProperty("driver");
		String url = pt.getProperty("url");
		String username = pt.getProperty("username");
		String password = pt.getProperty("password");
		String admin = pt.getProperty("admin");
		
		System.out.println("driver : "+driver);
		System.out.println("url: "+url);
		System.out.println("username"+username);
		System.out.println("password: "+password);
		System.out.println("admin : "+admin);
	}

}

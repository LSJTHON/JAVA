package ch17.sec04.exam01;
import java.util.*;
import java.util.stream.Stream;
public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();
		for(int i =0; i<=5;i++) {
			Product product = new Product(i, "상품"+i,"멋진회사",(int)(10000*Math.random()));
			list.add(product);
			
		}
		
		Stream<Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
	}

}

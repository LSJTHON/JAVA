package thisisjava;

public class PrintTest {

	public static void main(String[] args) {
		int value =123;
		System.out.printf("상품의 가격:%d원\n",value);
		System.out.printf("상품의 가격:%6d원\n",value);
		System.out.printf("상품의 가격:%-6d원\n",value);
		System.out.printf("상품의 가격:%d원\n",value);
	}

}

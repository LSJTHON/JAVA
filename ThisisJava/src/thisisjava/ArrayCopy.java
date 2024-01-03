package thisisjava;

public class ArrayCopy {

	public static void main(String[] args) {
//		int[] oldIntArray =  {1,2,3};
//		
//		int[] newIntArray =  new int[5];
//		
//		for (int i = 0; i<oldIntArray.length;i++) {
//			newIntArray[i] = oldIntArray[i];
//		}
//		for (int i = 0; i<newIntArray.length;i++) {
//			System.out.print(newIntArray[i]+", ");	
//		}
//		
//		
//		int[] oldArray = {1,2,3,4,5,6,7,8,9};
//		int[] newArray = new int[6];
//		
//		System.arraycopy(oldArray, 0, newArray, 0, newArray.length);
//	
//		for (int i = 0; i<newArray.length;i++) {
//			System.out.print(newArray[i]+", ");	
//		}
		int[] oldArray = {0,1,2,3,4};
		int[] newArray = new int[5];
		int sum = 0;
		for(int i:oldArray) {
			newArray[i] = i;
			sum += i;
			System.out.println(newArray[i]+"\tsum:"+sum);
		}
	}
}

package day7;

public class Ex4_Array4_Copy {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = num1;
		System.out.println( "num1: " + num1 + "num2: " + num2);
		// arr2 배열을 성상하여 arr1 배열을 복사하고, arr2 배열값을 출력하세요
		int arr1[] = {1,4,6,8};
		int arr2[] = new int [arr1.length];
		int arr3[] = arr1;
		int arr4[] = new int [arr1.length];
		for(int i = 0 ; i < arr1.length ; i++) {
			arr2[i] = arr1[i];
		}
		/*arr1 의 값들을 기능을 통해 arr4에 복사
		 *arr1 배열의 있는 값들을 0번지 부터  arr.length 개 복사하여
		 *arr4 배렬의 0번지 부터 붙여넣어줌	 
		 */
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		arr1[0] = 0 ;
		
		System.out.print("arr1 :");
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println( "");
		
		System.out.print("arr2 :");
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		System.out.println( "");
		
		System.out.print("arr3 :");
		for(int i = 0; i<arr3.length; i++) {
			System.out.print(arr3[i]+ " ");
		}
		System.out.println( "");
		
		System.out.print("arr4 :");
		for(int i = 0; i<arr4.length; i++) {
			System.out.print(arr4[i]+ " ");
		}
		System.out.println( "");
	}

}

package day8;

import java.util.Scanner;

public class Ex9_Method6_Array {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5};
		int n = 5;
		int num = 5;
		printarray(arr);
		System.out.println(contaics(arr,num));
		System.out.println(countains(arr,n,num));
	}
	/*기능 : 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 코드
	 * 매개변수 : 정수형 배열 => int num[]
	 * 리턴탄입 : 없음 => void
	 * 메소드명 : printArray
	 */
	public static void printarray (int num[]) {
		for(int i = 0; i < num.length ; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}	
	/*기능 : 정수형 배열에 정수 num가 있는지 없는지 알려주는 코드
	 * 매개변수 : 정수형 배열 => 정수 num => lnt arr[], int num
	 * 리턴타입 : 해당 숫자가 있는지 없는지 -> boolean
	 * 메소드명 : contains
	 */
	public static boolean contaics(int arr[], int num) {
		if(arr == null || arr.length == 0) {
			return false;
		}
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	/* 기능 : 정수형 배열에서 처음부터 n개 중에서 정수 num가 있는지 없는지 알려주는 메소드
	 * 매개변수 : 정수형 배열 => 정수 num => int arr[], int n, int num, 
	 * 리턴타입 : 해당 숫자가 있는지 없는지 -> boolean
	 * 매소드명 : contains
	 */
	public static boolean countains(int arr[], int n, int num)	{
		if(arr == null || arr.length == 0) {
			return false;
		}
		if(arr.length < n) {
			n = arr.length;
			}
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] == num) {
				return true;
		}		
	}
		return false;
	}
}



				 
		     


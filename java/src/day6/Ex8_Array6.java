package day6;

import java.util.Scanner;

public class Ex8_Array6 {

	public static void main(String[] args) {
		/* 정수 num의 약수를 배열에 저장 한 후, 출력하는 코드를 작성하세요
		 * 약수는 최대 10개만 저장
		 */

		Scanner scan = new Scanner(System.in);
		
		int [] score = new int [10];
		int num = 0;
		int j = 0;
		System.out.print("정수 : ");
		num = scan.nextInt();
		
		for ( int i = 1 ; i <= num ; i++) {
			if ((num % i) == 0 ) {
				score[j] = i ;
				System.out.print( score[j] + " " );
				j++;
				
			}		
		}
 }
}

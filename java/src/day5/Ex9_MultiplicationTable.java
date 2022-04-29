package day5;

import java.util.Scanner;

public class Ex9_MultiplicationTable {

	public static void main(String[] args) {
		/* 구구단 7단을 출력하는 코드를 작성하세요
		 * 
		 */
	Scanner scan = new Scanner(System.in);

	for( int num = 1 ; num <= 9 ; num++) {
		//System.out.println( i + "*" + num + "=" + (i*num) );
		}
	//* 구구단 2단에서 9단 까지 출력하는 코드를 작성하세요
	
	for ( int num = 2 ; num <= 9 ; num ++) {
		for(int i = 1 ; i <= 9 ; i ++){
			System.out.println( num + "*" + i + "=" + (num*i));
		}
	}
}
}

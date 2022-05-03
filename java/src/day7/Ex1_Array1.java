package day7;

import java.util.Scanner;

public class Ex1_Array1 {

	public static void main(String[] args) {
		/* 5개 짜리 배열을 만들고, 0번지에 1, 1번지에 2, ... 4번지의 5를 저장하고, 출력하는 코드를 작성하세요.
		 * 
		 */
		
	Scanner scan = new Scanner(System.in);
		
		int [] score = new int [5];
		
		for( int i = 0 ; i < 5 ; i++ ) {
			score[i] = i+1;
			System.out.println(score[i]);
		}
		
	}

}

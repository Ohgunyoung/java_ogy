package day4;

import java.util.Scanner;

public class Ex_break2 {

	public static void main(String[] args) {
		/* 정수를 5번 입력하고, 입력한 정수를 콘솔에 출력하는 코드를 작성하세요
		 */
		
		int i = 1, num=0 ;
		
		Scanner scan = new Scanner(System.in);
		
		
		for(; ;) {
			System.out.print("양의 정수 입력 :");
			num = scan.nextInt();
			if(num < 0) {
			break;	
			}
			System.out.println(num);
		}
		scan.close();
	}
}
	
	

		
		
	

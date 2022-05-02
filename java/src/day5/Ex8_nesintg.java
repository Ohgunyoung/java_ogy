package day5;

import java.util.Scanner;

public class Ex8_nesintg {

	public static void main(String[] args) {
		/* 1부터ㅏ 100사이의 모든 소수를 출력하는 코드를 작성하세요
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		for(int num = 1 ; num <= 100 ; num++) {
				int count = 0;
				for(int i = 1 ; i <=num ; i++)
					
					if(num % i ==0) {
						count++;
					}
				
				if(count == 2)
					System.out.print(num + " ");
		}
	}
}
		



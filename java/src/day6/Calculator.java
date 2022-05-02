package day6;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		
		for( ; ; ) {
			System.out.print("문자를 입력하세요 : ");
			char ch = scan.next().charAt(0);
			System.out.println("입력한 실수는 "+ch+"입니다");
			if (ch == 'q') {
				break;
			}
				
		}
		*/
		
		/*
		char ch ='a';
		for( ; ch!='q' ;) {
		System.out.print("문자를 입력하세요 : ");
		ch = scan.next().charAt(0);
		System.out.println("입력한 실수는 "+ch+"입니다");
	
		}
		*/
		/*
		char ch = 'q';
		do {
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			System.out.println("입력한 실수는 "+ch+"입니다");
		}while(ch != 'q');
		*/
		
		/* 문자를 콘솔에서 입력받아 입력받은 문자를 출력하는 코드를 작성하세요.
		 * 단, q가 입력될때까지 입력을 계속적으로 받습니다
		 *  이 때, q를 입력받으면 q를 출력하고 종료합니다.
		 *  메뉴를 선택하면 정수 2개를 입력받아 입력받은 값에 맞는 산술 연산결과를 출력하는
		 *  코드를 작성하세요  
		 */
		char ch = 'a';
		
			System.out.println("산술 연산자 메뉴");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 나머지");
			System.out.println("q. 종료");
			System.out.print("메뉴를 선택하세요");
			ch = scan.next().charAt(0);
			
			if(ch == 'q') {
				break;
			}
			
			if(ch < '1' || ch > '5') {
				System.out.println("잘못된 연산자입니다.");
				continue;
			}
			
			System.out.print("두 정수를 입력하세요 (예 : 1 2) : ");
			int num1 = scan.nextInt();			
			int num2 = scan.nextInt();
			double res = 0.0;
			switch(ch) {
			case '1':
				res = num1 + num2;
				System.out.println( "" + num1 + '+' + num2  + "=" + res);
				break;
			case '2':
				res = num1 - num2;
				System.out.println( "" + num1 + '-' + num2  + "=" + res);
				break;
			case '3':
				res = num1 * num2;
				System.out.println( "" + num1 + '*' + num2  + "=" + res);
				break;
			}
	}
}

package day3;

import java.util.Scanner;

public class ex7_Switch3 {

	public static void main(String[] args) {
		/*두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 switch문으로 작성하세요
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = scan.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = scan.nextInt();
		
		System.out.print("산술연산자 : ");
		char op = scan.next().charAt(0);
		
		switch ( op ) {
		case '+':
		System.out.println(num1 + num2);
		break;
		case '-':
		System.out.println(num1 - num2);
		break;
		case '*':
		System.out.println(num1 * num2);
		break;
		case '/':
		System.out.println(num1 / (double)num2);
		break;
		case '%':
		System.out.println(num1 % num2);
		break;
		default:
		System.out.println("잘못된 연산자 입니다.");
		break;
		}

	}

}

package day3;

import java.util.Scanner;

public class ex3_scanner3 {

	public static void main(String[] args) {
		// 두 정수와 산순 연산자 (+ - * / %)를 입력받아 출력하는 코드를 작성하세요
		
		//방법1
		Scanner scan = new Scanner(System.in);
		System.out.println("정수1을 입력하세요");
		int num = scan.nextInt();
		
		System.out.println("산술 연산자를 입력하세요");
		char ch = scan.next().charAt(0);
		
		System.out.println("정수2을 입력하세요");
		int num1 = scan.nextInt();
		
		System.out.print(""+num + ch + num1);
		
		//방법2
	
		
		scan.close();
	}

}


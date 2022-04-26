package day2;

import java.util.Scanner;

public class ex18_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 콘솔창에서 정수를 입력하는 예제
		 * system.in : 콘솔에서 입력
		 */
		Scanner scan = new Scanner(system.in);
		System.out.println("정수를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("입력한 정수는 "num" 입니다" );
		scan.close();
	}

}

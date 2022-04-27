package day3;

import java.util.Scanner;

public class ex1_Scanner1 {

	public static void main(String[] args) {
		/* 한 학생의 수학, 영어, 국어 성적을 입력하고, 총점과 평균을 구하세요.
		 * 단, 성적은 정수로 입력받고 0~100사이의 정수를 입력해야 합니다.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.print("수학 : ");
		int num = scan.nextInt();
		
		
		System.out.print("영어 : ");
		int num1 = scan.nextInt();
		
			
		System.out.print("국어 : ");
		int num2 = scan.nextInt();
		
		scan.close();
		
		System.out.print( "수학 " + num  );
		System.out.print( " 영어 " + num1  );
		System.out.println( " 국어 " + num2  );
		System.out.println("총점 " + (num+num1+num2));
		System.out.println("평균 " + (num+num1+num2)/3.0);
	}
 
}


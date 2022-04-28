package day4;

import java.util.Scanner;

public class Ex2_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		double ave = 0;
		int num = 0;
		int i = 1;
		
		for(  i= 1 ; i <= 3 ; i++) {
			System.out.print(i + "국어 성적");
			num = scan.nextInt();
			sum = sum + num;
			}
		System.out.println("3명 학생의 국어 총점 :" + sum);
		ave = (double)sum /3;
		System.out.println("3명 학생의 국어 총점 :" + ave);
		
		scan.close();
	}

}

package day3;

import java.util.Scanner;

public class ex2_Scanner2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("실수를 입력하세요 : ");
		double num1 = scan.nextDouble();
		System.out.println("입력한 실수는 "+num1+"입니다");
		
		//next() : 공백전까지 단어를 읽어옴
		System.out.print("단어를 입력하세요 : ");
		String str = scan.next();
		System.out.println("입력한 실수는 "+str+"입니다");
		
		//Scanner 에는 문자를 받는 기능이 없
		//charAt(번지) : 문자열에서 번지에 해당하는 문자를 가져옴.0번지부터 시작
		System.out.print("단어를 입력하세요 : ");
		char ch = scan.next().charAt(0);
		System.out.println("입력한 실수는 "+ch+"입니다");
		
		scan.close();
		
		
	}

}

package day6;

import java.util.Scanner;

public class Ex6_Array4 {

	public static void main(String[] args) {
		// 배열의 1의 제곱부터 10의 제곱까지 저장하고, 출력하는 코드를 작성하세요
		int [] score= new int[10];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < 10 ; i++ ) {
			score[i] = (i+1) * (i+1);
			System.out.println( score[i]);
		}
	}
}

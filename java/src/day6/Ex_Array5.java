package day6;

import java.util.Scanner;

public class Ex_Array5 {

	public static void main(String[] args) {
		/* 최대 10명 학생의 성적을 저장하기 위한 배열을 선언하고,
		 * 입력할 학생수를 입력을 받아 입력 받은 학생수만큼 성적을 입력받고 총점과 평균을 출력하는 코드를 작성하세요
		 * 예>
		 * 학생수를 입력하세요 : 3
		 * 1번 학생 : 90
		 * 2번 학생 : 80
		 * 3번 학생 : 70
		 * 총점 : 240점, 평균 : 80점
		 * 
		 * 예2>
		 * 학생수를 입력하세요 : 11
		 * 최대 10명까지입니다.
		 * 
		 * 예3>
		 * 학생수를 입력하세요 : 0
		 * 최소 1명부터입니다.
		 */
		
		/*
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int max = 0;
		int [] score= new int[max];
		System.out.print( "학생 수 : " );
		max = scan.nextInt();
						
		for(int i = 0 ; i < score.length ; i++) {
			System.out.println( i+1 + "번 학생");
			score[i] = scan.nextInt();
		if( i+1 <= 0  || i+1 > 10 ) {
			System.out.println("최소 1명 부터 입니다.");
		if( i+1 == 1  || i+1 <= 10 ) {
			System.out.println("최대 10명 부터 입니다.");
			
				}
			}
		}
*/
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int max = 0;
		int [] score= new int[max];
		System.out.print( "학생 수 : " );
		max = scan.nextInt();
		
		if(count > 10) {
			System.out.println(" 최대 10명까지입니다.");
		}
		else if(count <= 0 ) {
		System.out.println("최소 1명부터 입니다.");
		}
		else {
			int sum = 0;
			double age = 0.0;
			for (int i = 0; i<count; 1++) {
				System.out.print(i + 1 + "번 학생 : ");
				score[i] =scan.nextInt();
				sum += score[i];
			}
			age = (double)sum / count;
			System.out.println("총점: " + sum +"점 " + "평균: " + age +"점");
			}
	}
}




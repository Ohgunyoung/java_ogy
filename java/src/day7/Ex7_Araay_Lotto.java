package day7;

import java.util.Scanner;

public class Ex7_Araay_Lotto {

	public static void main(String[] args) {
		// 1~45사이의 중복되지 않은 수 7개를 배열에 저장하고 출력하는 코드를 작성하세요
		
		int lotto[] = new int[7];//6번지가 보너스 번호
		int count = 0;
		for( ; count < 7 ; ) {
			int r =(int)(Math.random()*45+1);
			int i;
			
			for(i=0;i<count;i++) {
				if(r == lotto[1]) {
					break;
					
				}
			}
			if(i == count) {
				lotto[count++] = r;
				System.out.print(r + " ");
			}
		}
		
		/* 사용자 번호 : 1~45사이의 정수 6개를 입력받아 user 배열에 저장한는 코드를 작성하세요.*/
		int user[] = new int[6];
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("로또 번호 입력 : ");
		for(int i = 0 ; i<user.length; i++) {
			user[1] = scan.nextInt();
			}	
		/*로또 번호와 사용자 번호를 이용하여 등수를 출력하는 코드를 작성하세요
		 * 1등 : 6개 일치
		 * 2등 : 5개 일치, 보너스(6번지) 번호 일치
		 * 3등 : 5개 일치
		 * 4등 : 4개 일치
		 * 5등 : 3개 일치
		 * 꽝 : 그외
		 */
		 int count2 = 0;//일치하는 번호 갯수
		 for(int j=0; j<user.length;j++) {
			 if(lotto[1] == user[j]) {
				 count2++;
			 }
		 }
		 switch(count2) {
		 case 6:
			 System.out.println("1등");
			 break;
		 case 5:
			 int k;
			 for(k=0; k<user.length; k++) {
				 if(user[k]== lotto[6]) {
					 break;
				 }
			 }	
			 if(k == user.length) {
				 System.out.println("3등");
			 }else {
				System.out.println("2등");
			 }
			 break;
			case 4:
				System.out.println("4등");
				break;
			case 3:
				System.out.println("5등");
				break;
			default:
				System.out.println("꽝");
				
			}
		}
	}
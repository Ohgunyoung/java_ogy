package day7;

import java.util.Scanner;

public class Ex5_Array5_Baseball {
	
	public static void main(String[] args) {
		/* 정수 3개짜리 배열 com을 생성 한 후 랜덤으로 1~9사이의 세 정수를 만들어
		 * 배열에 저장하는 코드를 작성하세요. (중복 가능)*
		 */
		
		
		Scanner scan = new Scanner(System.in);
		int min = 1, max = 9;
		int com[] = new int[3];
		int user[] = new int[3];
		int S = 0 ;
		int B = 0 ;
		for(int i = 0; i < 3; i++){
			com[i] = (int)(Math.random() * (max-min+1) + min );
			System.out.print(com[i] + " ");
		}
		System.out.println("");
		
		/* 사용자가 정수 3개를 입력하여 3S 가 될때까지 게임을 진행하도록 코드를 작성하세요
		 * 단, 사용자가 입력한 정수도 배열에 저장.
		 */
		
		while(S<3) {
			System.out.print("1~9사이의 정수를 중복되지 않게 입력하세요 : ");
			user[0] = scan.nextInt();
			user[1] = scan.nextInt();
			user[2] = scan.nextInt();

			if(com[0] == user[0]) {
				S++;
			}
			if(com[1] == user[1]) {
				S++;
			}
			if(com[2] == user[2]) {
				S++;
			}
			if(com[0] == user[1] || com[0] == user[2])
				B++;
			if(com[1] == com[0] || com[1] == user[2])
				B++;
			if(com[2] == com[0] || com[2] == user[1])
				B++;
			if(S!=0) {
				System.out.println(S + "S");
			}
			if(B!=0) {
				System.out.println(B + "B");
				
			}
			if(S == 0 && B ==0) {
				System.out.println("0");
			}
			
		}
		scan.close();
	}
	
}	
	
	

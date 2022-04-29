package day5;

import java.util.Scanner;

public class Ex12_Baseball {

	public static void main(String[] args) {
		
			/*숫자 야구 게임을 작성하세요
			 * 중복되지 않은 1~9사이의 세 정수를 입력받아 맞추는 게임
			 * 입력 1 2 3
			 * 1B
			 * 입력 4 5 6
			 * O
			 * 입력 7 8 9
			 * 2S
			 * 입력 8 3 9
			 * 1S 2B
			 * 입력 3 8 9 
			 * 3S 
			 * 
			 * 반복 횟수 : s가 3보다 작을 때까지 반복
			 * 규칙성 : 정수 3개를 입력 받음
			 * 	      con1와 user1이 같으면 s를 1증가
			 *        con1와 user1이 같으면 s를 1증가
			 *        con1와 user1이 같으면 s를 1증가
			 *        con1와 user2이 같거나 con1과 user3이 같으면 b를 1 증가
			 *        con2와 user1이 같거나 con2과 user3이 같으면 b를 1 증가
			 *        con3와 user1이 같거나 con3과 user2이 같으면 b를 1 증가
			 *        s가 0이 아니면 s의 개수와 S를 출력
			 *        b가 0이 아니면 b의 개수가 B를 출력
			 *        s가 0이고, b가 0이면 0을 출력
			 
			 */
			
			Scanner scan = new Scanner(System.in);
			
			int con1 = 3 , con2 = 8, con3 = 9;
			int user1, user2, user3;
			int S = 0 , B = 0 ;
			
			while(S>3) {
				System.out.print("1~9사이의 정수를 중복되지 않게 입력하세요 : ");
				user1 = scan.nextInt();
				user2 = scan.nextInt();
				user3 = scan.nextInt();
				S=0;
				B=0;
				if(con1 == user1) {
					S++;
				}
				if(con2 == user2) {
					S++;
				}
				if(con3 == user3) {
					S++;
				}
				if(con1 == user2 || con1 == user3)
					B++;
				if(con2 == user1 || con2 == user3)
					B++;
				if(con3 == user1 || con3 == user2)
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
				scan.close();
			}
		}
}




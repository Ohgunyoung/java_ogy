package day4;

import java.util.Scanner;

public class Ex11_While {

	public static void main(String[] args) {
		/*다음과 같은 메뉴가 출력되고, 종료 메뉴를 입력할 때까지 반복하는 코드를 while 문으로 작성하세요
		 * 
		 * 메뉴
		 * 1. 학생정보입력
		 * 2. 학생정보출력
		 * 3. 학생정보수정
		 * 4. 학생정보삭제
		 * 5. 프로개름 종료
		 * 메뉴를 선택하세요 :
		 * 
		 * 반복횟수 : menu가 5가 아닐 때 까지
		 * 규칙성 : 메뉴를 출력하고 scanner를 통해 메뉴를 입력받아 menu에 저장
		 * 반목문 종료 후 : 없음
		 */
		Scanner scan = new Scanner(System.in);
		
		int i=1;
   	 	while(i != 5) {
   	 	System.out.println("메뉴");
   	 	System.out.println("1. 학생정보입력");
   	 	System.out.println("2. 학생정보출력");
   	 	System.out.println("3. 학생정보수정");
   	 	System.out.println("4. 학생정보삭제");
   	 	System.out.println("5. 프로그램종료");
   	 	System.out.print("메뉴를 선택하세요 :");
   	 	i = scan.nextInt();
   	 	}
   	 	
   	 	System.out.println("방법 1 종료.");
   	 	while(true) {
   	 	System.out.println("메뉴");
   	 	System.out.println("1. 학생정보입력");
   	 	System.out.println("2. 학생정보출력");
   	 	System.out.println("3. 학생정보수정");
   	 	System.out.println("4. 학생정보삭제");
   	 	System.out.println("5. 프로그램종료");
   	 	System.out.print("메뉴를 선택하세요 :");
   	 	i = scan.nextInt();
   	 	if(i == 5) {
   	 		break;
   	 	}
   	 }
}
}





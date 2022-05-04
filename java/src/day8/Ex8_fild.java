package day8;

public class Ex8_fild {
	
	public static void main(String[] args) {
	
	int num1 = 1, num2 = 2;
	int res = sum1(num1,num2);
	System.out.println(res);
	System.out.println(sum1(1,2));
	sum2(1,2);
	int res1 = sum1(1,2);
	int res2 = sum1(res,3);
	System.out.println(res2);
	}	
	/*  클래스     	설계도       자동차설계도
	 * 	객체		 	제품			자동차
	 * 	메소드	 	기능			시동,전진,후진
	 *  필드(맵버면수)	정보			바퀴수,속력,전원
	 *  
	 *  클래스 = 필드 + 메소드
	 *  
	 *  접근제한다 class 필드명
	 *  	//필드
	 *  	접근제한자 타입 변수명.
	 *  	//메소드
	 * 		객채의 동작(기능)
	 * 		호출해서 실행할수 있는 중괄호 {} 블록
	 * 		메소드 실행하면 중괄호 {} 블록에 있는 모든 코드들이 일괄 실행
	 * 		
	 * 		**좋은 메소드란 재사용성이 높은 메소드		
	 */
	
	/* 기능 : 두 정수가 주엊비면 두 정수의 합을 알려주는 메소드
	 *  매개변수 : 두 정수 => int num1, int num2
	 *  리턴타입 : 두 정수의 합 => 정수 => int 
	 *  메소드명 : sum
	 */
	public static int sum1(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
	/* 기능 : 두 정수가 주엊비면 두 정수의 합을 알려주는 메소드
	 *  매개변수 : 두 정수 => int num1, int num2
	 *  리턴타입 : 없음 => void
	 *  메소드명 : sum2
	 */
	public static void sum2 (int num1, int num2) {
		int res = num1 + num2;
		System.out.println(res);
	}
	
}

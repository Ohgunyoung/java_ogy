package day4;

public class EX6_break3 {
	public static void main(String[] args) {

	/* 두 정수의 최소 공배수를 구하는 예제
	 * 공배수 : 두 정수에 공통으로 있는 배수
	 * 최소 공배수 : 두 정수의 공배수 중 최소값
	 * 10의 배수 : 10 20 30 40 50 ....
	 * 15의 배수 : 15 30 45 60 .....
	 * 10 과 15의 공배수 : 30 60 90 120 150.....
	 * 10 과 15의 최소공배수는 30
	 * 
	 * 반복 횟수 : i는 num1*num2 까지 1씩 증가
	 * 규칙성 : i가 num1 의 배수이고 i가 num2의 배수이면 i를 출력하고 반복 종료
	 * 박복문 종료 후 : 없음
	 */
	
	int i=1 , num1 = 10 , num2 = 15 ;
	
	
	for ( ; i <=num1*num2 ; i++ ) {
		if(i % num1 == 0 && i % num2 == 0 ) {
			System.out.println("최소 공배수 :" + i);
			break;
			}
	}
	
}
}
package day2;

public class ex3_A {

	public static void main(String[] args) {
	/* 산술 연살자 주의 사항 : 나누기 진행 시 소수점 사라짐 주의
	 * 
	 * 정수 연산자 정수 => 정수
	 * 5 + 2 = 7
	 * 5 - 2 = 3
	 * 5 * 2 = 10
	 * 5 % 2 = 1
	 * 5 / 2 = 2
	 * 정수 연산자 실수 => 실수
	 * 실수 연산자 실수 => 실수
	 */
		
	System.out.println(5 + 2);
	System.out.println(5 - 2);
	System.out.println(5 * 2);
	System.out.println(5 % 2);
	System.out.println(5 / 2);
	// 산술 연술자 주의 사항 : 0으로 나눈 경우 에외가 발생 할 수도 있다.
	System.out.println(5 / 0);
	System.out.println(5 / 0.0);
	}

}

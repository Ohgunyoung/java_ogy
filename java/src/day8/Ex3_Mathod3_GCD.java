package day8;

public class Ex3_Mathod3_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 10, b = 80;
	int res = gcd(a, b);
	System.out.println( a+ "와 " + b +" 의 최대공약수는" + res );
	
	
	
	int res1 = gcd1(c, d);
	System.out.println( c+ "와 " + d +" 의 최소공배수는" + res1 );
	}

	/* 기능 : 두 정수가 주어지면 두 정수의 최대 공략수를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 두 정수의 최대 공략수 => 정수 => int
	 * 메도스 명 : gcd
	 */
	public static int gcd(int num1, int num2) {
	int res = 0;
	for ( int i=1 ; i <= num1 ; i++) {
		if(num1%i==0 && num2%i==0) {
			res = i ;
		}
	}
	return res;
	}	
	
	/* 기능 : 두 정수의 최소 공배수를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 두 정수의 최소 공약수 => 정수 => int
	 * 메소드 명: 1cm
	 */
	
	public static int gcd1 (int num1, int num2) {
	int res1 = 0;
	for ( int i=1 ; i <= num1*num2 ; i++) {
		if(num1 * i == num2) {
		res1 = i ;
		}
	}
	return res1 ;
	}	
}

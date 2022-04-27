package day3;

public class ex13_for6 {

	public static void main(String[] args) {
		/*두 정수의 최대 공약수를 구하는 코드를 작성하세요
		 * 공약수 : 두 정수의 약수 중 공통으로 있는 약수
		 * 최대 공약수 : 공약수 중 가능 큰 수
		 * 12 : 1 2 3 4 6 12
		 * 18 : 1 2 3 6 9 18
		 * 12와 18의 공약 수 : 1 2 3 6
		 * 12와 18의 최대 공약수 :6
		 */
		
		/*같은 타입의 변수를 여러개 선언하는 경우 ,를 통해 한줄로 선언할주 있다
		 * 타입 변수명 1;
		 * 타입 변수명 2;
		 * 타입 변수명 3, 변수명4;
		 * 
		 */
		
		int num1 = 12;
		int num2 = 18;
		int i = 1;
		for (i=1 ; i>0 ; i++) {
			if(num1%i==0 && num2%i==0) {
				System.out.print(i);
				}
			}
		}
	}


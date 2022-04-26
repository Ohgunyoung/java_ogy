package day2;

public class EX12_if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Num가 짝수이면 짝수라고 출력하고, 짝수가 아니면 홀수라고 출력하는 코드를 if문을 이용하여 작성하시오
		 * 
		 */
		int num = 3;
		
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수");
		}
		if(num % 2 != 0) {
			System.out.println(num + "은 홀수");
		}
		
		// if else문을 이용한 예제는 num가 짝수이면 1번 비교하고, 홀수이면 2번 비교합니다.
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
	}

}

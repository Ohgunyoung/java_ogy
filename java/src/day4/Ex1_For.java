package day4;

public class Ex1_For {

	public static void main(String[] args) {
		/*정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요
		 * 소수는 약수가 1과 자기자신이 수. 약수의 개수가 2개인 수
		 * 1 : 소수가 아님
		 * 2 : 소수. 1,2
		 * 3 : 소수. 1,3
		 * 4 : 소수가 아님 1,2,4
		 * 
		 */
		
		int num = 4 ;
		int count = 0 ;
		for(int i = 1 ; i <= num ; i ++ ) {
			if( num % i == 0) {
				count = count + 1;
				}
		}
		
		if(count==2) {
			System.out.println(num +"는 소수 입니다.");
			}
		else {
				System.out.println(num + "는 소수가 아닙니다.");
			}
		
	}
}

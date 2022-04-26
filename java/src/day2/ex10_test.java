package day2;

public class ex10_test {

	public static void main(String[] args) {
		/*num가 짝수인지 아닌지 확인하는 코드를 작성하세요
		 * A성적 출력하는 예제를 활용
		 */
		
		int num = 3;
		
		System.out.println(num + "짝수인가?" + (num % 2 == 0));
		
		/* num가 짝수이면 num라고 출력하고
		 * num가 짝수가 아니면 num는 홀수라고 출력하도록 코드를 작성해보세요
		 */
		String str = (num % 2 ==0 ) ? "짝수" : "홀수" ;
		System.out.println(num + "는" + str);
	}

}

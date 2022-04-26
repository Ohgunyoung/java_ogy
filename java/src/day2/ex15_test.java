package day2;

public class ex15_test {

	public static void main(String[] args) {
		/*monut가 주어질 때 해당 달의 마지막 일을 출력하는 코드를 if 문으로 작성하세요
		 * 
		 */
		int mouth = 0;
		if (mouth <=0 || mouth >= 13  ) {
			System.out.println( "잘못된 달 입니다");
		}
		else if(mouth == 2) {
			System.out.println("28일");
		}
		else if(mouth < 8 && mouth%2 == 1) {
			System.out.println("31일");
		}
		else if(mouth > 7  && mouth%2 == 0) {
			System.out.println("31일");
		}
		else if(mouth < 7  && mouth%2 == 0) {
			System.out.println("30일");
		}
		else {
			System.out.println("30일");
		}
}
}
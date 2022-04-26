package day2;

public class ex17_test4 {

	public static void main(String[] args) {
		/* num가 2의 배수라면 2의 배수라고 출력하고
		 * num가 3의 배수라면 3의 배수라고 출력하고
		 * num가 6의 배수라면 6의 배수라고 출력하고
		 * num가 2,3,6의 배수가 아니라면 2,3,6의 배수가 아니라고 출력하는 코드를 작성하세요
		 * 단, num가 6의 배수이면 6의 배수라고 출력해야 합니다. 2의 배수, 3의 배수 출력이 나오면 안됩니다.
		 * 
		 */
		int num = 12;
		
		if(num%6 == 0 ) {
			System.out.println("6의 배수 입니다");
		}
		else if(num%6 != 0 & num%2 ==0 ) {
			System.out.println("2의 배수 입니다");
		}
		else if(num%6 != 0 & num%3 == 0) {
			System.out.println("3의 배수 입니다");
		}
		else{
			System.out.println("2,3,6의 배수가 아닙니다.");
			
		}
	}

}

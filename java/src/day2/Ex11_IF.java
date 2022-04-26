package day2;

public class Ex11_IF {

	public static void main(String[] args) {
		/* num가 짝수이면 짝수라고 출력하는 코드를 if문을 이용하여 작성하세요
		 * 
		 */
		int num = 2;
		if(num % 2 == 0) {
			System.out.println(num + "는 짝수");
		}
		
		/* score가 90점 이상이고, 100점 이하라면 A 학점이라고 출력하는 코드를 IF문을 이용하여 작성하세요
		 * 
		 */
		int num1 = 90;
		if(num1 >=90 && num1 <= 100){
			System.out.println("A학점");
		}
	}
}


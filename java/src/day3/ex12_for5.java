package day3;

public class ex12_for5 {

	public static void main(String[] args) {
		/* num의 약수를 출력하는 코드를 작성하세요
		 * A의 약수 : A를 어떤 수로 나누었을 때 나머지가 0과 같은 수
		 * 12의 약수 : 1 2 3 4 6 12
		 */
	
		int num = 62;
		int A = 1;
		for(A=1 ; A<100 ; A++) {
			if(num%A==0) {	
				System.out.println(A);
		}		
	}
	}

}

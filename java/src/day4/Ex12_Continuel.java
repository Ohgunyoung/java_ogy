package day4;

public class Ex12_Continuel {

	public static void main(String[] args) {
		/* 1에서 10사이의 짝수를 출력하는 Continue를 이용하여 작성해보세요
		 * 
		 * 반복횟수 : i는 1부터 10까지 1씩 증가
		 * 규칙성 : i가 홀수이면 countinue, 아니면 i를 출력
		 * 반복문 종료 후 : 없음
		 */

		// for 문에서 continue는 증감위치로 이동
		for(int i = 1 ; i <= 10 ; i++) {
			if(i % 2 != 0) {
			continue;
			}
		System.out.println(i);
		}
		//while 문에서 continue는 조건식 위치로 이동
		int i = 1;
		while(i<=10) {
			if(i % 2 != 0) {
					i++;
					continue;
				}
				System.out.println(i);
				i++;
		}
	}
}

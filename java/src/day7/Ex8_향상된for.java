package day7;

public class Ex8_향상된for {

	public static void main(String[] args) {
		/* 향상된 for문
		 * -전체 탑색(배열의 값 전체를 확인 할 때 사용)
		 * -번지를 모르기 때문에 배열 값을 수정할 수 없고, 번지와 관련된 작업을 할 수 없다.
		 * for(타입 변수명 : 배열명){
		 * }
		 */
		int score[] = { 100, 90, 30};
		int sum = 0;
		double avg;
		
		for(int tmp : score) {
			sum += tmp;
		}
		avg = sum / (double)
				score.length;
		System.out.println("총점 : " + sum + ",평균 :" + avg);

	}

}

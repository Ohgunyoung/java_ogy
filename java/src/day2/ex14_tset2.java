package day2;

public class ex14_tset2 {

	public static void main(String[] args) {
		
		/* 성적에 맞는 학점을 출력하는 코드를 작성하세요
		 * A는 : 90 이상 ~ 100 이하
		 * B는 : 80 이상 ~ 90 미안
		 * C는 : 70 이상 ~ 80 미만
		 * D는 : 60 이상 ~ 70 미만
		 * F는 : 0 이상 ~ 60 미만
		 */
	int score = 110;
	if (score >=90 && score <= 100) {
		System.out.println("A");
	}
	else if (score >=80 && score < 90) {
		System.out.println("B");	
	}
	else if (score >=70 && score < 80) {
		System.out.println("C");	
	}
	else if (score >=60 && score < 70) {
		System.out.println("D");	
	}
	else if (score >=0 && score < 60) {
		System.out.println("F");	
	}
	else {
		System.out.println("잘못된 성적입니다");
	}
 }
}
package day2;

public class Ex6_logic {

	public static void main(String[] args) {
	/* AND : && ~하고, ~이고, 둘다 참이여야만 참
	 * OR : ||, ~하거나, ~이거나, 하나만 참이면 참
	 * XOR : ^, 둘다 같으면 거짓, 다르면 참
	 * NOT : !, 참은 거짓, 거짓은 참
	 */
		
	
	/* 성적 A학점인가? A 학점의 기준 90점 이상이고 100점 이하
	 * score 90점 이상이고, score가 100점 이하다
	 * score 90점 이상 && score 100점 이하
	 * 
	 */
	int score = 95;
	System.out.println(score + "점은 A학점인가" + (score >=90 && score <= 100));
	/* 잘못된 성적인가? 유요한 성적은 0점 이상 100이하
	 * 
	 */

	}
	
}

package day3;

public class ex6_Switch {

	public static void main(String[] args) {
		/* 월이 주어졌을 때 주어진 월의 마지막 일을 출력하는 코드를 작성하세요(Swiitch문)
		 *  31 : 1 3 5 7 8 10 12
		 *  30 : 4 6 9 11
		 *  28 : 2
		 */
		
		int month = 2;
		switch(month) {
		case 1:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 3:
			System.out.println("31");
			break;
		case 4:
			System.out.println("30");
			break;
		case 5:
			System.out.println("31");
			break;
		case 6:
			System.out.println("30");
			break;
		case 7:
			System.out.println("31");
			break;
		case 8:
			System.out.println("31");
			break;
		case 9:
			System.out.println("30");
			break;
		case 10:
			System.out.println("31");
			break;
		case 11:
			System.out.println("30");
			break;
		case 12:
			System.out.println("31");
			break;
		default: 
			System.out.println("잘못 입력 되었습니다.");
			break;
			
		}
			
	}

}

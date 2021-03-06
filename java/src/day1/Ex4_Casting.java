package day1;

public class Ex4_Casting {

	public static void main(String[] args) {
		/*1. 자동 타입 변환
		 *  - 작은 타입의 값은 큰 타입에 저장하는 경우
		 *2. 강제 타입 변환 : 값이나 변수 앞에 (타입명) 을 써 줌
		 *	- 큰 타입의 값을 작은 타입에 저장한는 경우(자동 타입 변환이 불가능 한 경우)
		 *	- 계산을 위해 특정 값을 일시적으로 변환하는 경우(/ 연산자 설명할 때 다시 언급)
		 */
		//자동 타입 변환 예
		byte num1_1 = 1;
		int num1_2 = num1_1;
		double num1_3 = num1_2;;
		
		//강제 타입변환 예
		int num2_1 = 1;
		byte num2_2 = (byte)num2_1;
		num2_1 = (int)1.23;
		
		//강제 타입 변환 예 : 계산을 위해 특정값을 일시적으로 변환하는 경우
		double num3_1 = 1/2; // 1/2는 0.5가 아니라 0
		double num3_2 = (double) 1/2; //1.0 / 2는 0.5
		System.out.println(num3_1);
		System.out.println(num3_2);
		
		int num4_1 = 1;
		double num4_2 = 1.23;
		double num4_3 = num4_1 + num4_2; // num4_1가 더 큰 값인 double(실수)가 되어 실수로 변환되어 실수 + 실수로 계산됨
		double num4_4 = num4_1 + 5; // num4_1(정수) 와 5(정수)가 더해지고 실수 타입의 명령의 따라 결과 값이 double(실수)로 표현 됨
		System.out.println(num4_3);
		System.out.println(num4_4);
		
		
		// 정수를 실수로 타입변환 시, 자동타입변환 할 때 정밀성이 떨어 질 수 있다.
		// 정수를 실수로 변환 시, double 사용 
		int num5_1 = 1234567890;
		float num5_2 = num5_1; //자동 타입 변환
		int num5_3 = (int)num5_1; // 강제 타입 변환
		
		System.out.println(num5_1);
		System.out.println(num5_2);
		System.out.println(num5_3);
		
		
	}

}

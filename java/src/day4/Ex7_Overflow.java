package day4;

public class Ex7_Overflow {

	public static void main(String[] args) {
		/* 정수에서 표헌 범위를 넘어가는 경우 발생*/
		 byte num = 127;
		 /*byte 로 표현 가능한 가장 큰 정수 127에 1을 더하면 128이 아닌 -128이 저징
		  * byte는 128을 표현할 수 없기 때문에
		 * 이렇나 현상을 오버 플로우라고 함
		 */
		num = (byte)(num+1);
		System.out.println(num);
		
		num = (byte)(num-1);
		System.out.println(num);
	}

}

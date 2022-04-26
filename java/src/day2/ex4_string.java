package day2;

public class ex4_string {
	/*문자열 + 문자열 => 문자열
	 * 문자열 + 정수 => 문자열
	 * 문자열 + 문자 => 문자열
	 * 문자열 + 실수 => 문자열
	 * 
	 */
	public static void main(String[] args) {
	 String str = "Hello";
	 str = str + " world";
	 System.out.println(str);
	 str = str + '!';
	 System.out.println(str);
	 str = str + 123;
	 System.out.println(str);
	 str = str + 3.45;
	 System.out.println(str);
	}

}

package day4;

public class Ex9_While {

	public static void main(String[] args) {
		// 1부터 5까지의 합을 구하는 코드를  while 문을 이용하여 작성하세요
		
		int i = 1, sum = 0;
		while(i <= 5) {
			sum += i++;
		}
		System.out.println(sum);
		}
	}



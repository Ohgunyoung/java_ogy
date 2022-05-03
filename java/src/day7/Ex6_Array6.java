package day7;

import java.util.Scanner;

public class Ex6_Array6 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		int min = 1, max = 9;
		int com[] = new int[3];
		int user[] = new int[3];
		int S = 0 ;
		int B = 0 ;
		for(int i = 0; i < 3; i++){
			com[i] = (int)(Math.random() * (max-min+1) + min );
			System.out.print(com[i] + " ");
		}
		System.out.println("");
		
	}

}

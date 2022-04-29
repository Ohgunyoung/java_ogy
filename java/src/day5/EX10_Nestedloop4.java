package day5;

import java.util.Scanner;

public class EX10_Nestedloop4 {

	public static void main(String[] args) {
	
	/* a
	 * ab
	 * abc
	 * ...
	 * abcdefg...xyz
	 */
		
		Scanner scan = new Scanner(System.in);
	    for ( char ch = 'a' ; ch <= 'z' ; ch++ ) {
	    	for ( char i = 'a' ; i <= ch ; i++) {
	    		  System.out.print( i );
	    		  }
	    	  System.out.println( );
	    	}
	      }
	}



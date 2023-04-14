package oopspart2;

import java.util.Scanner;

public class NextInt {
	
	
	public static void main(String[] args) {

		int sum = 0,num;

		var scan = new Scanner(System.in);

		System.out.println("enter the valid number");

		while (true) {

			try {

				 num =  scan.nextInt();

				if (num > 0) {

					sum = sum + num;
				}

				if (num == 0) {
					break;
				}

			}

			catch (NumberFormatException nfe) {

				System.out.println("entered wrong number");
			}
		}

		System.out.println("sum" + sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

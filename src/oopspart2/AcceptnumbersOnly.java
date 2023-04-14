package oopspart2;

import java.util.Scanner;

public class AcceptnumbersOnly {

	public static void main(String[] args) {
		
		int sum =0,count =0,n=0;
		
     Scanner sc = new Scanner(System.in); {
		

		while (true) {

			try {

				n = Integer.parseInt(sc.nextLine());

				sum = sum + n;

				count++;

				if (count == 5) {
					break;
				}

			}

			catch (NumberFormatException nf) {

				System.out.println(" not valid number");

			}
		}
	}

		System.out.println(sum);

	}

}

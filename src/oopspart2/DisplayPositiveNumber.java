package oopspart2;

import java.util.Scanner;

public class DisplayPositiveNumber {

	public static void main(String[] args) {

		int sum = 0;

		var scan = new Scanner(System.in);

		System.out.println("enter the valid number");

		while (true) {

			try {

				int num = Integer.parseInt(scan.nextLine());

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

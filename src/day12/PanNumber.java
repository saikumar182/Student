package day12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PanNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter pan number:");

		String aadhar = scan.nextLine();

//		if (Pattern.matches("[A-z]{5}[0-9]{4}[A-Z]{1}", pan)) {
//
//			System.out.println("valid  pan number");}
		
			
		
			if (Pattern.matches("[0-9]{12}",aadhar)) {

			System.out.println("valid  aadhar number");
		}
		
		else

			System.out.println("invalid  pan number");

	}

}
 
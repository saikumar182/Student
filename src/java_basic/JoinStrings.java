package java_basic;

import java.util.Scanner;
import java.util.StringJoiner;

public class JoinStrings {

	public static void main(String[] args) {

		var strj = new StringJoiner("_");

		var sc = new Scanner(System.in);

		while (true) {

			System.out.println("enter the name [end to stop]");

			String name = sc.nextLine();

			if (name.equals("end"))

				break;

			strj.add(name);
		}

		System.out.println(strj.toString());

	}
}
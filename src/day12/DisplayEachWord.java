package day12;

import java.util.regex.Pattern;

public class DisplayEachWord {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\W");
		String[] names = p.split("how are you");

		for (String s : names)

			System.out.println(s );

	}



}

package java_lang;

import java.util.Arrays;

public class SortProductNameOrPrice {

	public static void main(String[] args) {

		Product PR[] = { new Product("bat", 1500), new Product("ball", 300) };
		Arrays.sort(PR, new CompareByPrice());
		for (var i : PR)
			System.out.println(i);

	}

}
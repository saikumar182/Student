package java_lang;

import java.util.Arrays;

public class SortByAge {

	public static void main(String[] args) {
		Person people[] = { new Person("ajith", 7), new Person("vijay", 22), new Person("satya", 15),
				new Person("virat", 18) };
		Arrays.sort(people, new CompareByAge());
		for (var sp : people)
			System.out.println(sp);
	}

}

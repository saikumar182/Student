package day12;

import java.util.Comparator;
import java.util.TreeSet;

public class SortByLength {

	public static void main(String[] args) {

		TreeSet<String> strings = new TreeSet<String>(new LengthComparator());

		strings.add("smithii");
		strings.add("marsh");
		strings.add("marnus");
		strings.add("josh");
		strings.add("peter");
		strings.add("abd");

		System.out.println(strings);

	}

	static class LengthComparator implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {

			return s1.length() - s2.length();
		}

	}
}

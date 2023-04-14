package day11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class UniqueNames {

	public static void main(String[] args) throws IOException {

		Path name1path = Path.of("/home/saikumar/sort/name.txt");

		Path name2path = Path.of("/home/saikumar/name2/name.txt");

		var name1 = new LinkedHashSet<String>(Files.readAllLines(name1path));

		LinkedHashSet<String> name2 = new LinkedHashSet<String>();

		for (String i : Files.readAllLines(name2path)) {
			if (name1.contains(i)) {
				name2.add(i);
			}
		}
		for (String i : name2) {
			System.out.println(i);
		}
	}

}

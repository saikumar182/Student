package day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortedOrder {

	public static void main(String[] args) throws Exception {

		Path path = Path.of("/home/saikumar/sort/name.txt");

		var names = Files.readAllLines(path);

		var uniquenames = new TreeSet<String>(names);

		for (var name : uniquenames)

			System.out.println(name);
	}

}

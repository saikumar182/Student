package day11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ToUppercase {

	public static void main(String[] args) throws IOException {

		Path p = Path.of("/home/saikumar/java/filename.txt");

		String str = Files.readString(p);

		String n = str.toUpperCase();

		System.out.println(n);

	}

}

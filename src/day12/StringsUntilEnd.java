package day12;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


public class StringsUntilEnd {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter names:");
		Scanner s = new Scanner(System.in);
		FileWriter fw = new FileWriter("'/home/saikumar/sort/name.txt' +\n");
			
		var<String> strings = new ArrayList<>();
		while (true) {
			String name = s.nextLine();
			if (name.equals("end")) {
				break;
			}
			strings.add(name);
		}
		for (var i : strings) {
			if (((String) i).matches("[a-zA-Z]+[0-9]+")) {
				fw.write(i + "\n");

			}
		}
		fw.close();
		s.close();

	}

}






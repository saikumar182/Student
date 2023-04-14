package java_lang;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class DisplaySortedOrder {
	

		public static void main(String[] args) throws IOException, NumberFormatException {
			String filepath = ("/home/saikumar/Acessfile/filename.txt");
			Path p = Path.of(filepath);
			Pattern pat = Pattern.compile("\\p{Punct}+|\s+");
			List<String> temp = Files.lines(p).toList();
			TreeMap<String, String> t1 = new TreeMap<>();
			for (var k : temp) {
				String pair[] = pat.split(k);
				if (Character.isDigit(pair[0].charAt(0)))
					t1.put(pair[1], pair[0]);
				else
					t1.put(pair[0], pair[1]);
			}
			for (String k : t1.keySet())
				System.out.println(k + " : " + t1.get(k));
		}
	}





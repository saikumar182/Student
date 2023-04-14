package day12;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  Spaces {

	public static void main(String[] args) throws Exception {
		Path path = Path.of("C hii     how are you    man");
	

		Pattern p = Pattern.compile(" +");
		Matcher m = p.matcher((CharSequence) path);
		String output = m.replaceAll("\s");
		System.out.println(output);
	}

}



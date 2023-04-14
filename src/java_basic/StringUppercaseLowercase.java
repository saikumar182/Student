package java_basic;

public class StringUppercaseLowercase {

	public static void main(String[] args) {

		String str = "how are YOU";

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (Character.isUpperCase(charArray[i])) {

				charArray[i] = Character.toLowerCase(charArray[i]);

			}

			else if (Character.isLowerCase(charArray[i])) {

				charArray[i] = Character.toUpperCase(charArray[i]);

			}
		}

		str = new String(charArray);

		System.out.println(str);

	}
}
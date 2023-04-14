package java_basic;

public class Strings {
	
	
	
	public static void main (String []args) {
		
		
		String s1 =" virat ";
		
		String s2 =new String ("virat");
		
		System.out.println(s1.replace("v" ,"d"));
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.length());
		System.out.println(s1==s2);
		System.out.println(s1.substring(1,4));
		System.out.println(s1.equals(s2));
		System.out.println(s1.split("/"));
}
}
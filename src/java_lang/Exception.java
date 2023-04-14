package java_lang;

public class Exception {

	public static void main(String[] args) {
		
		
		int a=10,b=2,c=10;
		
	try {
		
		c=a/ b;
		
		System.out.println(c);
		
	}
	
	catch (ArithmeticException ae) {
	System.out.println("virat");
	
	}	
		finally {
			
			System.out.println("sai");
		}
		
		System.out.println("kumar");
	}

}

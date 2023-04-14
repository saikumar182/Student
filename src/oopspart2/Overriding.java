package oopspart2;

class Parent {

	public void property() {

		System.out.println("parent property");

	}
}

class Son extends Parent {

	public void property() {

		System.out.println("son property");

	}

}

public class Overriding {
	
	 public static void main (String[]args) {
		 
	Parent p= new Parent();
	
	p.property();
	
	Son s1 =new Son();
	
	s1.property();

   }
}



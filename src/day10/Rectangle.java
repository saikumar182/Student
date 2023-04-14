package day10;

public class Rectangle {
	
	int h,b;
	double area ;
	//private char[] areaOfRectangle;
	
	
	public double areaOfRectangle( int h, int b) {
	
	area =22*h*b;
return area;
}
	
	public static void main (String[]args) {
		
		Rectangle r =new Rectangle();
		
		System.out.println(r.areaOfRectangle(10,20));
		
	}
	
}
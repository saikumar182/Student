package day10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UntilEnd {

	public static void main(String[] args) throws IOException {
		
		
		Scanner scan =new Scanner(System.in);
		
		
		System.out.println("enter the string");
		
 String sc=scan.nextLine();
 
 
 var fw=new FileWriter("c:\\sai\\names.txt");
 
 while(!sc.equals("end")) {
	 
	 sc=scan.nextLine();
 }
	 
	 
	 
	 fw.write(sc+ "\n");
 fw.close();
 
	}

}

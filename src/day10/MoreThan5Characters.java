package day10;

import java.io.BufferedReader;
import java.io.FileReader;

public class MoreThan5Characters {

	public static void main(String[] args)  throws Exception {
		
		FileReader fr= new FileReader("/home/saikumar/java/filename.txt ");
		
		BufferedReader bf = new BufferedReader(fr);
		
		String line ;
		
		line=bf.readLine();
		
		
		
		while(line!=null) {
			
			
			if(line.length()>=5) {
				
				System.out.println("print the String");
				
			}
			
			line=bf.readLine();
		}
	}

}

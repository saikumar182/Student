package day10;

import java.io.BufferedReader;
import java.io.FileReader;

public class UppercaseLowercase {

	public static void main(String[] args)   throws Exception {
		
		
		try (FileReader fr =new FileReader("/home/saikumar/Acessfile/filename.txt");){

       BufferedReader br =new BufferedReader(fr);
       
       
       int uc,Lc,digits;;
	
       int uc1=Lc=digits=0;
       
    String line = br.readLine();


   


while(line!=null) {
	
	for(int i=0;i<=line.length()-1;i++) {
		
		
		if(Character.isUpperCase(line.charAt(i))) {
			
	uc1++;
		
		}else if	(Character.isLowerCase(line.charAt(i))) {
				
				Lc++;
			}else  {
			
			digits++;
	
	}
	
	}
	
	line=br.readLine();
}
System.out.println(uc1);

System.out.println (Lc);

System.out.println(digits);
		}
	}
}
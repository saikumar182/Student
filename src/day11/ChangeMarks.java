package day11;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ChangeMarks {

	public static void main(String[] args) throws Exception {
		
		
		Scanner scan =new Scanner(System.in);
	 	
		
try	(RandomAccessFile  raf =new RandomAccessFile("/home/saikumar/ram/name.dat", "rw");)	{
	
	
	
	System.out.println("enter the roll number");
	int a = scan.nextInt();
	raf.seek((a-1) * 4);
	System.out.println("Enter new Marks:");
	int b=scan.nextInt();
	raf.seek((a-1) * 4);
	raf.writeInt(b);
	raf.seek(0);
	for (int i = 0; i < 20; i++) {
		System.out.println(raf.readInt());
	}


}
	
}
}
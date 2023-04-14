package day11;

import java.io.RandomAccessFile;
import java.util.Scanner;
import java.io.EOFException;

public class RollNumber {

	public static void main(String[] args) throws Exception {

		int rollnumber = 6;
		int[] marks = new int[20];

		Scanner scan = new Scanner(System.in);

		try (var acf = new RandomAccessFile("/home/saikumar/ram/name.dat", "rw");) {

			acf.seek((rollnumber - 1) * 4);

			System.out.println(acf.readInt());

			acf.seek(8 * 4);
		

		} catch (EOFException ex) {

			System.out.println(ex.getMessage());
		}

	}

}

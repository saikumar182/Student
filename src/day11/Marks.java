package day11;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) throws Exception {

		int[] marks = new int[20];

		Scanner scan = new Scanner(System.in);

		var acf = new RandomAccessFile("/home/saikumar/ram/name.dat", "rw");

		for (int i = 0; i < 20; i++) {

			marks[i] = (int) (Math.random() * 100);

		}

		for (int n : marks)

			acf.writeInt(n);

		acf.seek(0);

		for (int i = 0; i < 20; i++) {

			System.out.println(acf.readInt());
		}
	}

}

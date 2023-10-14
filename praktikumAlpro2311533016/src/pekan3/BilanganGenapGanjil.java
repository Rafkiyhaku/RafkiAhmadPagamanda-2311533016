package pekan3;

import java.util.Scanner;

public class BilanganGenapGanjil {
	public static void main(String[] args) {
		long NIM;
		Scanner input = new Scanner (System.in);
		
		System.out.print("masukkan NIM anda: ");
		NIM =input.nextLong();
		input.close();
		
		if (NIM % 2 == 0) {
			System.out.println("Merupakan bilangan genap");
			
		} else {
			System.out.println("Merupakan bilangan ganjil");
		}

	}
}

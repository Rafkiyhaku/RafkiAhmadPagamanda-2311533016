package pekan2;

import java.util.Scanner;

public class OperatorAritmatika {

	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		Scanner keyboard = new Scanner(System.in);
		keyboard.close();
		System.out.print("input angka-1:");
		A1 = keyboard.nextInt();
		System.out.print("input angka-2:");
		A2= keyboard.nextInt();
		System.out.print("operator penjumlahan");
		hasil = A1 + A2; //penjumlahan
		System.out.println("hasil =" + hasil);
		System.out.print("operator pengurangan");
		hasil = A1 - A2; //pengurangan
		System.out.println("hasil =" + hasil);
		System.out.print("operator perkalian");
		hasil = A1 * A2; //perkalian
		System.out.println("hasil =" + hasil);
		System.out.print("operator hasil bagi");
		hasil = A1 / A2; //pembagian
		System.out.println("hasil =" + hasil);
		System.out.print("operator sisa bagi");
		hasil = A1 % A2; //sisa bagi
		System.out.println("hasil =" + hasil);
	}

}

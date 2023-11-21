package pekan6;

import java.util.Scanner;

public class Ternary1 {

	public static void main(String[] args) {
		double IPK;
		Scanner input=new Scanner(System.in);
		System.out.println("Input IPK Anda = ");
		IPK=input.nextDouble();
		String hasil = (IPK > 2.75)?"Anda Lulus Sangat Memuaskan":"Anda Lulus Memuaskan";
		System.out.println(hasil);
		
	}

}

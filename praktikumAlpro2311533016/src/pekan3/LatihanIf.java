package pekan3;

import java.util.Scanner;
public class LatihanIf {

	public static void main(String[] args) {
		double IPK;
		Scanner input = new Scanner (System.in);
		
		System.out.print("masukkan ipk anda: ");
		IPK =input.nextDouble();
		input.close();
		
		if (IPK >2.75) {
			System.out.println("Anda Lulus Sangat Memuaskan Dengan IPK = "+IPK);
			
		}
		
	}

}

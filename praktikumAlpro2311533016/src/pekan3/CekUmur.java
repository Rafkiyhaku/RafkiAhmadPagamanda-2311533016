package pekan3;

import java.util.Scanner;
public class CekUmur {

	public static void main(String[] args) {
		int umur;
		char sim;
		
		Scanner a = new Scanner (System.in);
		
		System.out.print("input umur anda: ");
		umur = a.nextInt();
		
		System.out.print("apakah anda sudah mempunyai sim c: ");
		sim=a.next().charAt(0);
		
		a.close();
		
		if ( (umur >= 17) && (sim=='y')) {
			System.out.println("anda sudah dewasa dan boleh mengemudi ");
		}
		else {
			System.out.println("anda masih anak-anak ");
		}
	}
}

	

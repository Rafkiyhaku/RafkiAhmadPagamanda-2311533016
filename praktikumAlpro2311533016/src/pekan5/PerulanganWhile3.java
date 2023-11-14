package pekan5;
import java.util.Scanner;
public class PerulanganWhile3 {
	public static void main(String[] args) {
		//deklarasi variabel
		int umur;
		int counter = 0;
		String jawab = "ya" ;
		char SIM;
		Scanner scan = new Scanner(System.in);
		while (jawab.equalsIgnoreCase("ya")) {		
			System.out.print("input umur anda: ");
			umur = scan.nextInt();
			System.out.print("apakah anda sudah mempunyai sim c: ");
			SIM=scan.next().charAt(0);
		
		if ( (umur >= 17) && (SIM=='y')) {
			System.out.println("anda sudah dewasa dan boleh bawa motor ");
		}
		if ( (umur >= 17) && (SIM!='y')) {
			System.out.println("anda sudah dewasa tetapi belum boleh bawa motor ");
		}
		if ( (umur < 17) && (SIM !='y')) {
			System.out.println("anda belum cukup umur bawa motor ");
		}
		if ( (umur < 17) && (SIM =='y')) {
			System.out.println("anda belum cukup umur punya SIM ");
		}
		System.out.println("Apakah lanjut (ya / tidak?)");
		jawab= scan.next();
		
	}
	while(!jawab.equalsIgnoreCase("tidak"));
	System.out.println("Terimakasih sudah menggunakan program ini");
	scan.close();
	}
}


	

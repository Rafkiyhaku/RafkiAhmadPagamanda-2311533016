package pekan2;

import java.util.Scanner;

public class LuasPersegiPanjang {

	public static void main(String[] args) {
		int p,l,luas;
		Scanner input= new Scanner(System.in);
		input.close();
		System.out.print("panjang segi empat= ");
		p=input.nextInt();
		System.out.print("Lebar Segi Empat= ");
		l=input.nextInt();
		luas= p*l;
		System.out.println("Luas segi empat adalah= "+ luas);
	}

}

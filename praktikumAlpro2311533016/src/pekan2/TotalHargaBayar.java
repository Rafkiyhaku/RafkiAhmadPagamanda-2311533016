package pekan2;

public class TotalHargaBayar {

	public static void main(String[] args) {
		double hargabarang=220500;
		double jumlahbarang=7;
		double diskon=0.3;
		double totalharga;
		
		
		totalharga= (hargabarang*jumlahbarang)*(1-diskon);
		System.out.println("total harga bayar = "+ totalharga);
		
  }

}

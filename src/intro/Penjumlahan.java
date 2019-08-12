package intro;

import java.util.Scanner;

public class Penjumlahan
{


	public static void main (String[]args)
	{
		
		int bil1;
		int bil2; 
		int jumlah;
		Scanner masukan = new Scanner(System.in);
		System.out.print("Masukkan Nilai Pertama :");
		bil1 = masukan.nextInt();
		
		System.out.print("Masukkan Nilai Kedua :");
		bil2 = masukan.nextInt();
		
		
		jumlah = bil1 + bil2;
		System.out.print("Jumlah :" + jumlah);
		
	}		
		
}
	
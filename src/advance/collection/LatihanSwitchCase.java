package advance.collection;

import java.util.*;

public class LatihanSwitchCase
{
	Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		LatihanSwitchCase ls = new LatihanSwitchCase();
		ls.Aritmatika();


		

	}

	public void Aritmatika()
	{
		System.out.println("[1]. Penjumlahan");
		System.out.println("[2]. Perkalian");
		System.out.println("[3]. Pengurangan");
		System.out.println("[4]. Pembagian");
		System.out.println("[5]. Keluar");


		System.out.print("Pilih Menu : ");
		int aritmatika = input.nextInt();

		switch(aritmatika)
		{
			case 1 : Penjumlahan(); break;
		}
	}

	public void Penjumlahan()
	{
		int nilai1;
		int nilai2;
		int hasil;


		System.out.print("Masukkan Nilai Pertama : ");
		nilai1 = input.nextInt();
		System.out.print("Masukkan Nilai Kedua : ");
		nilai2 = input.nextInt();

		hasil = nilai1+nilai2;
		System.out.println("Hasil Penjumlahannya : "+hasil);
	}
}
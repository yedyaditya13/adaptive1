package intro;

import java.util.*;

public class OperasiAritmatika {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int a, b, tambah, kurang, kali, bagi;
		System.out.print("a : ");
		a = input.nextInt();
		System.out.print("b : ");
		b = input.nextInt();
		tambah = a+b;
		kurang = a-b;
		kali = a*b;
		bagi = a/b;
		
		System.out.println("Nilai Penjumalahan : "+ tambah + "\n" + "Nilai Pengurangan : " + kurang + 
		"\n" + "Nilai Perkalian : " + kali + "\n" + "Nilai Pembagian : " + bagi );
	}
}
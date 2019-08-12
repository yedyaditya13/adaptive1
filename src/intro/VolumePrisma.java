package intro;

import java.util.*;

public class VolumePrisma
{
	public static void main(String[] args)
	{
		String strAlas = null;
		String strTinggi = null;
		String strTinggiPrisma = null;
		double alas;
		double tinggi;
		double tinggiprisma;
		double vol;
		double luas;
		
		Scanner input = new Scanner(System.in);
		Segitiga ls1 = new Segitiga();
		
		
		System.out.println("Masukkan Alas :");
		strAlas =  input.nextLine();
		System.out.println("Masukkan Tinggi  :");
		strTinggi =  input.nextLine();
		System.out.println("Masukkan Tinggi Prisma :");
		strTinggiPrisma=  input.nextLine();
		System.out.println("=====================");
		
		alas = Double.parseDouble(strAlas);
		tinggi = Double.parseDouble(strTinggi);
		tinggiprisma= Double.parseDouble(strTinggiPrisma);
		
		luas = ls1.Hitung(alas,tinggi);
		vol = (luas*tinggiprisma);
		System.out.println("Volume Prisma = 1/2 Luas Segitiga * TinggiPrisma\n"+luas+" "+"x"+" "+tinggiprisma+" "+"="+" "+ vol);
		
	}
}
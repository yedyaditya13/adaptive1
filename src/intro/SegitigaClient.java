package intro;

import java.util.*;

public class SegitigaClient
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Segitiga ls = new Segitiga();
		String strAlas = null;
		String strTinggi = null;
		double alas = 0;
		double tinggi=0;
		double luas=0;
		
		
		System.out.println("Masukkan alas :");
		strAlas =  input.nextLine();
		System.out.println("Masukkan tinggi :");
		strTinggi =  input.nextLine();
		alas = Double.parseDouble(strAlas);
		tinggi = Double.parseDouble(strTinggi);
		
		//luas = (alas *tinggi)/2;
		luas = ls.Hitung(alas, tinggi);
		System.out.println("Luas Segitiga -> 1/2 x "  + alas +" " + "x" + " " + tinggi +" "+ "=" +" "+luas);
	}
	
	
}
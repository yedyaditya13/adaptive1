package basic;
import java.util.*;

public class NamaBulan
{
	public static void main(String args[])
	{
		int noBulan;
		int[] arrInt = null;
		Scanner input = new Scanner(System.in);
		
		String namaBulan[] = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
		
		System.out.println("");
		System.out.println("Aplikasi Mengetahui Nama Bulan");
		System.out.println("==============================");
		System.out.print("Masukkan nomor urut bulan : ");
		noBulan = input.nextInt();
		System.out.println("Nama Bulan Dari No. Urut"+" "+noBulan+" adalah "+namaBulan[noBulan-1]);
		
		
		
	}
	
	
}
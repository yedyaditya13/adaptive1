package basic;

import java.util.Scanner;
public class Array
{
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		String namaHari[] =  {"Senin", "Selasa", "Rabu", "Kamis", "Jumat","Sabtu","Minggu"};
		
		System.out.println("\n");
		System.out.println("Hari ke-1 : "+ namaHari[0]);
		System.out.println("Hari ke-2 : "+ namaHari[1]);
		System.out.println("Hari ke-3 : "+ namaHari[2]);
		System.out.println("Hari ke-4 : "+ namaHari[3]);
		System.out.println("Hari ke-5 : "+ namaHari[4]);
		System.out.println("Hari ke-6 : "+ namaHari[5]);
		System.out.println("Hari ke-7 : "+ namaHari[6]);
		System.out.println("Jumlah Hari : "+namaHari.length+" Hari");
		
		System.out.println("\n");
		String satuan[] = {"Kg","Ltr","m"};
		System.out.println("Jumlah Satuan : "+satuan.length);
		System.out.println("\n");
		
		String namaPelajaran[] = null;
		namaPelajaran =  new String[10];	//Jumlah Matapelajaran sudah ditentukan
		System.out.print("\n");     
		
		String mataPelajaran[] = null;
		
		System.out.print("Jumlah Mata Pelajaran :");     //JUmlah Matapelajaran Diinput
		int temp = input.nextInt();
		mataPelajaran = new String[temp] ;
		
		
		System.out.println("Jumlah Pelajaran : " +namaPelajaran.length); //menghitung panjang mata pelajaran
		
		System.out.println("Pelajaran ke-1 : " +namaPelajaran[0]);
		System.out.println("Pelajaran ke-2 : " +namaPelajaran[1]);
		namaPelajaran[0]= "IPA";
		System.out.println("Pelajaran ke-1 : " +namaPelajaran[0]);
		System.out.println("Pelajaran ke-2 : " +namaPelajaran[1]);
		namaPelajaran[0]= "IPS";
		namaPelajaran[1]= "PKN";
		System.out.println("Pelajaran ke-1 : " +namaPelajaran[0]);
		System.out.println("Pelajaran ke-2 : " +namaPelajaran[1]);
		
		
	}
}
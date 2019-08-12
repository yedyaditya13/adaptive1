package basic;

import java.text.SimpleDateFormat;

public class Variable		//Contoh Penggunaan Variable Dengan Tipe Data Primitive dan Class
{
	public static void main(String args[])
	{
		int i = 5;						//Contoh Tipe Daata Primitive
		Integer jumlahMuridTipe1 =  new Integer(5);   //Tipe Data Class
		Integer jumlahMuridTipe2 = 5;					//Tipe Daata Primitive
		String namaMuridTipe1 =  new String ("William"); 	//Tipe Data Class
		String namaMuridTipe2 = "William";					//Tipe Daata Primitive
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");	//Tipe Data Class
		
		System.out.println("i:"+1);
		System.out.println("Jumlah Murid Tipe1 :"+jumlahMuridTipe1);
		System.out.println("Jumlah Murid Tipe2 :"+jumlahMuridTipe2);
		System.out.println("Nama Murid Tipe1 :"+namaMuridTipe1);
		System.out.println("Nama Murid Tipe2 :"+namaMuridTipe2);
		
		System.out.println("\n");
	}	
	
}
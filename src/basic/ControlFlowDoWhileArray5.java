package basic;

import java.util.*;

public class ControlFlowDoWhileArray5 //Penjumlahan Matriks 
{				
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
	
		int indexBaris = 0;
		int indexKolom = 0;

		String strBaris = null;
		String strKolom = null;
		String strJlhBaris = null;
	
		int inputBaris=0;
		int inputKolom=0;
		//private Integer[][] matriksA;
		//private Integer[][] matriksB;
		Integer matriksA[][] = null;
		Integer matriksB[][] = null;
		Integer matriksHasil[][]= null;
		
		
		System.out.println("===================================");
		System.out.println("Aplikasi Penjumlahan Nilai Matriks");
		System.out.println("===================================");
		
		System.out.print("\n");
		System.out.print("Masukkan Jumlah Baris : ");
		strBaris = input.nextLine();
		inputBaris = Integer.parseInt(strBaris);
	
		
		System.out.print("Masukkan Jumlah Kolom : ");
		strKolom = input.nextLine();
		inputKolom = Integer.parseInt(strKolom);
	
		matriksA = new Integer[inputBaris][inputKolom];
		matriksB = new Integer[inputBaris][inputKolom];
		matriksHasil = new Integer[inputBaris][inputKolom];
		
		System.out.println("\n");
		System.out.println("Masukkan Nilai dari Matriks A: ");
		
		do
		{
			do
			{
				System.out.print("A "+(indexBaris+1)+" "+(indexKolom+1)+" : ");
				matriksA[indexBaris][indexKolom]= input.nextInt();
				indexKolom++;
			}
			while(indexKolom < inputKolom);
		
			indexKolom=0;
		
			indexBaris++;
		}
		while(indexBaris < inputBaris );
		
		System.out.println("\n");
		System.out.println("Masukkan Nilai dari Matriks B: ");
		indexBaris = 0;
		indexKolom = 0;
		
		do
		{
			do
			{
				System.out.print("A "+(indexBaris+1)+" "+(indexKolom+1)+" : ");
				matriksB[indexBaris][indexKolom]= input.nextInt();
				indexKolom++;
			}
			while(indexKolom < inputKolom);
			
			indexKolom=0;
			//System.out.print("A "+(indexBaris+1)+" "+(indexKolom+1)+" : ");
			indexBaris++;
		}
		while(indexBaris < inputBaris );
		
		System.out.println("\n");
		System.out.println("Matriks A ("+inputBaris+","+inputKolom+ ") :");
		
		indexBaris = 0;
		indexKolom = 0;
		
		do
		{
			do
			{
				System.out.println(matriksA[indexBaris][indexKolom]);
				indexKolom++;
			}
			while(indexKolom < inputKolom);
			
			indexKolom = 0;
			indexBaris++;
		}
		while(indexBaris < inputBaris);
		
		System.out.println("\n");
		System.out.println("Matriks B ("+inputBaris+","+inputKolom+ ") :");
		
		indexBaris = 0;
		indexKolom = 0;
		
		do
		{
			do
			{
				System.out.println(matriksB[indexBaris][indexKolom]);
				indexKolom++;
			}
			while(indexKolom < inputKolom);
			
			indexKolom = 0;
			indexBaris++;
		}
		while(indexBaris < inputBaris);
		
		System.out.println("\n");
		System.out.println("Penjumlahan Matriiks A dab B ("+inputBaris+","+inputKolom+ ") :");
		
		indexBaris = 0;
		indexKolom = 0;
		
		do
		{
			do
			{
				matriksHasil[indexBaris][indexKolom] = matriksA[indexBaris][indexKolom] + matriksB[indexBaris][indexKolom];
				System.out.println(matriksHasil[indexBaris][indexKolom]);
				indexKolom++;
			}
			while(indexKolom < inputKolom);
			
			indexKolom = 0;
			indexBaris++;
		}
		while(indexBaris < inputBaris);
		
	}
}
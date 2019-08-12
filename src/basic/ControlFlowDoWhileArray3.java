package basic;

import java.util.*;

public class ControlFlowDoWhileArray3	//RATA RATA NILAI
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		//String strinputNilai = null;
		//float jlhPelajaran;
		int jlhPelajaran;
		int index = 0;
		int indexHitung = 0;
		float jumlah  = 0;
		//float nilai[];
		int nilai[];
		float rataNilai = 0;
		System.out.println("===================================");
		System.out.println("Aplikasi Menghitung Nilai Rata-Rata");
		System.out.println("===================================");
		
		System.out.print("\n");
		System.out.print("Jumlah Mata Pelajaran : ");
		//jlhPelajaran =  input.nextFloat();
		jlhPelajaran =  input.nextInt();
		
		nilai = new int[jlhPelajaran];
		
		do
		{
			System.out.print("Nilai Pelajaran "+ (index+1) +" : ");
			nilai[index] = input.nextInt();
			index++;
		}
		while( index <= jlhPelajaran -1 );
		
		do
		{
			jumlah =jumlah + nilai[indexHitung];
			indexHitung++;
		}
		while(indexHitung <= jlhPelajaran - 1);
		
		
		rataNilai = jumlah / jlhPelajaran;
		
		System.out.print("Rata-Rata Nilai : "+ rataNilai);
	}
	
	
}
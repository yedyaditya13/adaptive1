package basic;

import java.util.*;

public class ControlFlowDoWhileArray4			//menampilakan data dari inputan dan mencari nilai terbesar dan terkecil
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String strNamaSiswa = null;
		String strNamaMapel = null;
		String strDaftarNama="";
		String pelajaranTerendah=null;		
		String pelajaranTerbesar=null;		
		int jlhPelajaran = 0;
		int index = 0;
		int indexHitung = 0;
		float jumlah  = 0;
		
		int nilai[] = null;
		String namaMapel[]=null;
		float rataNilai = 0;
		System.out.println("===================================");
		System.out.println("Aplikasi Menghitung Nilai Rata-Rata");
		System.out.println("===================================");
		
		System.out.print("\n");
		System.out.print("Nama Siswa : ");
		strNamaSiswa = input.nextLine();
		
		
		System.out.print("Jumlah Mata Pelajaran : ");
		String strjlhPelajaran =  input.nextLine();
		jlhPelajaran = Integer.parseInt(strjlhPelajaran);
		
		nilai = new int[jlhPelajaran];
		namaMapel = new String[jlhPelajaran];
		
		do
		{
			System.out.print("Nama Pelajaran "+ (index+1) +" :" );
			namaMapel[index] =  input.nextLine();
		
			
			System.out.print("Nilai Pelajaran "+ (index+1) +" : ");
			String strNilai = input.nextLine();
			nilai[index] = Integer.parseInt(strNilai);
			
			index++;
		}
		while( index < jlhPelajaran );
		
		System.out.print("\n");
		
		do
		{
			jumlah =jumlah + nilai[indexHitung];
			indexHitung++;
		}
		while(indexHitung < jlhPelajaran);
		
		rataNilai = jumlah / jlhPelajaran;
		index = 0;
		
		do
		{
			if (index == (jlhPelajaran - 1))
				{
					strDaftarNama += namaMapel[index];
				}
				else
				{
					strDaftarNama += namaMapel[index]+ ", ";
				}
				
				index++;
		}
		while(index < jlhPelajaran);
		
		int terbesar=nilai[0];
		int terkecil=nilai[0];
		index=0;
		
		do
		{
			if (nilai[index] <= terbesar)
			{
				terkecil = nilai[index];
				pelajaranTerendah= namaMapel[index];
				//terbesar = nilai[index];
				//namaMapel[index]; 
				//System.out.println("Nilai Pelajaran Terbesar : "+ terbesar+namaMapel[index]);
				
			}
			if (nilai[index]>= terbesar)
			{
				terbesar= nilai[index];
				pelajaranTerbesar= namaMapel[index];
			}
			
			index++;
		}
		while(index < jlhPelajaran);
		
		
		System.out.println("Nama Siswa : "+ strNamaSiswa);
		System.out.println("Pelajaran Yang Diikuti : "+strDaftarNama);
		System.out.println("Rata-Rata Nilai : "+ rataNilai);
		System.out.println("Nilai Pelajaran Terbesar : "+ pelajaranTerbesar+" dengan nilai "+terbesar);
		System.out.println("Nilai Pelajaran Terkecil : "+ pelajaranTerendah+" dengan nilai "+terkecil);
		
		
	}
}
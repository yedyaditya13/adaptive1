package basic;
import java.util.*;

public class NilaiRata2Siswa3	///belum sukes hasinya
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String strNamaSiswa = null;
		String strNamaMapel = null;
		int jlhPelajaran;
		int index = 0;
		int indexHitung = 0;
		float jumlah  = 0;
		//float nilai[];
		int nilai[];
		String namaMapel[]=null;
		float rataNilai = 0;
		System.out.println("===================================");
		System.out.println("Aplikasi Menghitung Nilai Rata-Rata");
		System.out.println("===================================");
		
		System.out.print("\n");
		System.out.print("Nama Siswa : ");
		strNamaSiswa = input.nextLine();
		
		System.out.print("Jumlah Mata Pelajaran : ");
		jlhPelajaran =  input.nextInt();
		
		nilai = new int[jlhPelajaran];
		namaMapel = new String[jlhPelajaran];
		
		
		
		while( index <= jlhPelajaran -1 )
		{
			System.out.println("Nama Pelajaran "+ (index+1) +" : ");
			strNamaMapel = input.nextLine();
			namaMapel[index] = strNamaMapel;
			//namaMapel[index] = input.nextLine();
			
			
			System.out.print("Nilai Pelajaran "+ (index+1) +" : ");
			nilai[index] = input.nextInt();
			
			index++;
		}
		
		
			
		
		while(indexHitung <= jlhPelajaran - 1)
		{
			jumlah =jumlah + nilai[indexHitung];
			indexHitung++;
		}
		rataNilai = jumlah / jlhPelajaran;
		
		System.out.print("Nama Siswa : "+strNamaSiswa);
		System.out.print("Pelajaran Yang Diikuti : "+namaMapel[index]);
		System.out.print("Rata-Rata Nilai : "+ rataNilai);
		System.out.print("Pelajaran Dengan Nilai Tertinggi : "+namaMapel[index]+" Dengan Nilai"+nilai[index]);
		System.out.print("Pelajaran Dengan Nilai Terendah : "+namaMapel[index]+" Dengan Nilai"+nilai[index]);
	}
	
	
}
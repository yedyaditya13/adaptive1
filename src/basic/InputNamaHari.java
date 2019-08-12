package basic;
import java.util.*;

public class InputNamaHari
{
	public static void main(String args[])
	{
		
		
		Scanner input = new Scanner(System.in);
		
		String namaHari[] = new String[7];
		String inputNama;
		int inputNomor;
		System.out.println("Aplikasi Mengetahui Urut Dan Nama Hari");
		System.out.println("==============================");
		//inputNama = input.nextLine();
		
		System.out.print("Masukkan nama hari 1 :");
		inputNama = input.nextLine();
		//inputNama = namaHari[0];
		//namaHari[0] = inputNama.toStringArray();
		namaHari[0] = inputNama;
		
		System.out.print("Masukkan nama hari 2 :");
		inputNama = input.nextLine();
		namaHari[1] = inputNama;
		
		System.out.print("Masukkan nama hari 3 :");
		inputNama = input.nextLine();
		namaHari[2] = inputNama;
		
		System.out.print("Masukkan nama hari 4 :");
		inputNama = input.nextLine();
		namaHari[3] = inputNama;
		System.out.print("Masukkan nama hari 5 :");
		inputNama = input.nextLine();
		namaHari[4] = inputNama;
		System.out.print("Masukkan nama hari 6 :");
		inputNama = input.nextLine();
		namaHari[5] = inputNama;
		System.out.print("Masukkan nama hari 7 :");
		inputNama = input.nextLine();
		namaHari[6] = inputNama;
		
		System.out.print("Masukkan No Urut Hari : " );
		inputNomor = input.nextInt();
		System.out.println("Nama Hari Dari No Urut "+inputNomor+" Adalah"+" "+namaHari[inputNomor-1]);
		
	
	}
	
	
}
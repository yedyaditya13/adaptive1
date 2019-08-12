package basic;
import java.util.Scanner;

public class OperatorConditionalAnd
{
	public static void main(String args[])
	{
		
			Scanner input = new Scanner(System.in);
			String jenisKelamin = null;
			String strUmur = null;
			int umur = 0;
			System.out.println("\n");
			System.out.println("======================================================");
			System.out.println("Selamat Datang Dalam Turnamen Bola Basket Pelajar Pria");
			System.out.println("======================================================");
			System.out.println("\n");
			System.out.println("===============================");
			System.out.println("Masukkan Informasi Pendaftaran");
			System.out.println("===============================");
			System.out.print("Jenis Kelamin [Laki-Laki | Perempuan] : ");
			jenisKelamin =  input.nextLine();
	 		System.out.print("Umur : [15 - 20] : ");
			strUmur = input.nextLine();
			umur = Integer.parseInt(strUmur);
			
			if ((umur>=15) && (jenisKelamin.equals("Laki-Laki")))
			{
				System.out.println("Selamat anda dapat mengikuti turnamen!!");
			}
			else 
			{
				System.out.println("Maaf, anda tidak dapat mengikuti turnamen");
			}
			
		
	}
}
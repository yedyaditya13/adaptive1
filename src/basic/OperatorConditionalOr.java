package basic;
import java.util.Scanner;

public class OperatorConditionalOr
{
	public static void main(String args[])
	{
		
			Scanner input = new Scanner(System.in);
			String caraPembayaran = null;
			String jenisKartuKredit = null;
			
			
			System.out.println("\n");
			System.out.println("=========================================");
			System.out.println("Selamat Datang Dalam Situs Belanja Online");
			System.out.println("=========================================");
			System.out.println("\n");
			System.out.println("===============================");
			System.out.print("Cara Pembayaran Anda [Tunai / Kredit] : ");
			caraPembayaran =  input.nextLine();
			System.out.print("Jenis Kartu Kredit [Master Card / Visa] : ");
			jenisKartuKredit = input.nextLine();
	 		
			if ((caraPembayaran.equals("Tunai")) || (jenisKartuKredit.equals("Visa")))
			{
				System.out.println("Transaksi Anda Telah Diproses!!!");
				
			}
			else 
			{
				System.out.println("Maaf, transaksi anda tidak dapat diproses!!!");
			}
			
		
	}
}
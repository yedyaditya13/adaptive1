
import java.util.*;

public class Phase1_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int bil1;
		int bil2;
		int hasil;

		System.out.print("Masukkan Bilangan 1 : ");
		bil1=input.nextInt();

		System.out.print("Masukkan Bilangan 2 : ");
		bil2=input.nextInt();

		hasil = bil1+bil2;


		System.out.print(bil1 + " + " + bil2 + " = " +hasil);

	}
}
package intro;
import java.util.*;

public class PersegiClient
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PersegiPanjang pp = new PersegiPanjang();
		String strPanjang = null;
		String strLebar = null;
		double panjang = 0;
		double lebar=0;
		double luas=0;
		
		
		System.out.print("Masukkan Panjang :");
		strPanjang =  input.nextLine();
		System.out.print("Masukkan Lebar :");
		strLebar =  input.nextLine();
		panjang = Double.parseDouble(strPanjang);
		lebar = Double.parseDouble(strLebar);
		
	
		luas = pp.Hitung(panjang,lebar);
		System.out.println("Luas Persegi Panjang = Panjang x Lebar\n"+panjang+" "+ "x" + " " + lebar +" "+ "=" +" "+luas);
	}
	
	
}
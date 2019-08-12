package intro;
import java.util.*;

public class LingkaranClient{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);	
		Lingkaran lk = new Lingkaran();
		
		String strjari = null;
		int r;
		double luas;
		
		System.out.print("Diketahui Nilai r : ");
		strjari = input.nextLine();
		r = Integer.parseInt(strjari);
		
		System.out.println("Luas Lingkaran dengan Jari-Jari"+" "+r+" "+"adalah"+" "+lk.Hitung(r));
	}
}
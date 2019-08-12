package intro;
import java.util.*;

public class VolumeBolaClient
{
	public static void main(String[] args)
	{
		int r ;
		double vol;
		Bola bola = new Bola();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Jari-Jari:"); 
		r =  input.nextInt();
		System.out.println("=====================");
		
		//vol = (((3.14*r*r*r)*4)/3);
		vol = bola.Hitung(r);
		//System.out.println("Volume Bola dengan Jari-Jari"+" "+r+" "+"adalah"+" "+bola.Hitung(r));
		System.out.println("Volume Bola dengan Jari-Jari"+" "+r+" "+"adalah"+" "+vol);
	}
}
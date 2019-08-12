package intro;
import java.util.*;

public class VolPrisma
{
	public static void main(String[] args)
	{
		int panjang;
		int lebar;
		int tinggi;
		double vol;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan panjang :");
		panjang =  input.nextInt();
		System.out.println("Masukkan lebar :");
		lebar =  input.nextInt();
		System.out.println("Masukkan tinggi :");
		tinggi =  input.nextInt();
		
		vol = (panjang * lebar * tinggi)/2;
		System.out.println("Volume Prisma :" + vol);
		//LuasSegitiga ls = new LuasSegitiga();
		
		//vol = luas * tinggi;
		//System.out.println("Volume Prisma :" + vol);
		//System.out.println("Volume Prisma :" + vol);
		
		//luas = (alas *tinggi)/2;
		//System.out.println("Luas Segitiga :" + luas);
		
	}
}
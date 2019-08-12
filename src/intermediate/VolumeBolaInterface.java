package intermediate;

import java.util.*;

public class VolumeBolaInterface
{
	public static void main(String[] args)
	{
		MatematikaImpl matematikaImpl = new MatematikaImpl();
		int r ;
		double vol;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Jari-Jari:"); 
		r =  input.nextInt();
		System.out.println("=====================");
		
		System.out.println("Volume Bola :"+matematikaImpl.volumeBola(r));

	

	}
}
package intermediate;

import java.util.*;

public class VolPrismaInterface
{	
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		String strAlas=null;
		String strTinggi=null;
		String strTinggiPrisma=null;
		double alas;
		double tinggi;
		double tinggiPrisma;
	
		MatematikaImpl matematikaImpl = new MatematikaImpl();
		
		System.out.print("Masukkan nilai alas : ");
		strAlas =input.nextLine();
		alas = Float.parseFloat(strAlas);
		System.out.print("Masukkan nilai tinggi : ");
		strTinggi =input.nextLine();
		tinggi = Float.parseFloat(strTinggi);
		System.out.print("Masukkan nilai tinggi Prisma : ");
		strTinggiPrisma =input.nextLine();
		tinggiPrisma = Float.parseFloat(strTinggiPrisma);
		
		System.out.println("\n");
		System.out.println("VolumePrisma :"+matematikaImpl.volumePrisma(alas,tinggi,tinggiPrisma));
		
		
	}
	
	
}
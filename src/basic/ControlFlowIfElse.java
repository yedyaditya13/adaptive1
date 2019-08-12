package basic;
import java.util.*;

public class ControlFlowIfElse
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		String strHutang = null;
		String strGaji = null;
		float hutang=0;
		float gaji =0;
		
		System.out.println("\n");
		System.out.print("Hutang : ");
		strHutang = input.nextLine();
		System.out.print("Gaji : ");
		strGaji = input.nextLine();
		hutang = Float.parseFloat(strHutang);
		gaji =  Float.parseFloat(strGaji);
		
		if (hutang>gaji)
		{
				System.out.println("Anda Punya Hutang!!!");
		}
		else
		{
			System.out.println("Anda Tidak Punya Hutang");
			if (gaji > 10000)
			{
				System.out.println("Anda Boleh Mendapat Pinjaman");
			}
		}
		
		
	}
}
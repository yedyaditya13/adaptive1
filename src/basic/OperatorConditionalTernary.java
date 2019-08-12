package basic;
import java.util.Scanner;

public class OperatorConditionalTernary
{
	public OperatorConditionalTernary()
	{
		
		System.out.println("OPERATOR CONDITIONAL TERNARY ......");
		
	}
	public static void main(String args[])
	{
		
			Scanner input = new Scanner(System.in);
			String strIpk = null;
			String prestasi = null;
			float ipk = 0;
			
			System.out.println("\n");
			System.out.print("Masukkan Informasi IPK : ");
			strIpk =  input.nextLine();
			ipk = Float.parseFloat(strIpk);
	 		
			prestasi = (ipk>=3.5) ? "Cum Laude" : "Biasa";
			System.out.println("Prestasi : "+prestasi);
			
		
	}
}
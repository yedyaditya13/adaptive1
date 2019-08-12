
import java.util.*;

public class Phase1_3
{
	
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);

		double number1;
		double number2;
		
		IPhase1_3 penjumlahan = new Phase1_3Impl();
		
		System.out.print("Masukkan Bilangan 1 : ");
		number1=input.nextDouble();
		System.out.print("Masukkan Bilangan 2 : ");
		number2=input.nextDouble();
		System.out.println(number1+" + "+number2+" = "+penjumlahan.plus(number1, number2));
		
		
	}
}
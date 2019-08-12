import java.util.*;

public interface Phase1_3Interface
{
	
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);

		double number1;
		double number2;
		
		Phase1_3Imp matematikaImpl = new Phase1_3Imp();
		System.out.print("Masukkan Bilangan 1 : ");
		number1=input.nextDouble();
		System.out.print("Masukkan Bilangan 2 : ");
		number2=input.nextDouble();
		System.out.println(number1+" + "+number2+" = "+matematikaImpl.plus(number1, number2));
		
		
	}
}
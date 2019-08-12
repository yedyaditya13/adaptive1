package intermediate;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class APINumber
{
	
	public static void main (String args[])
	{
		System.out.println("API Number Contructor..........");
		double decimal = 7.27467;
		System.out.println("The test number : "+ decimal);
		int decimalPlaces = 3;
		
		//use BigDecimal class
		BigDecimal bd = new BigDecimal(decimal);
		
		//set the scale and round up if >= 0.5
		
		bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
		double bigDecimal = bd.doubleValue();
		
		System.out.println("BigDecimal rounded in 3rd decimal : "+bigDecimal);
		
		System.out.println("");
		
		//use of DecimalFormat
		
		DecimalFormat decFormat = new DecimalFormat("#.00");
		//double formatDecimal = decFormat.format(decimal).doubleValue();
		System.out.println("DecimalFormat rounded in 2nd decimal : "+decFormat.format(decimal));
		
		System.out.println("");
		System.out.println("======================================");
		System.out.println("");
		
		// 2 digit before decimal point and then 2 digit(rounded)
		
		DecimalFormat numFormat;
		String number;
		
		numFormat = new DecimalFormat("000.##");
		number = numFormat.format(-15.567);
		System.out.println("1. DecimalFormat with : "+number);
		
		System.out.println("");
		
		//string '$' in front number
		numFormat = new DecimalFormat("'$'00.####");
		number = numFormat.format(15.567);
		System.out.println("2. Decimal format with '$' : "+number);
		System.out.println("");
		
		//use of, to group number
		numFormat = new DecimalFormat ("#,###.###");
		number = numFormat.format(1556789);
		System.out.println("3. Decimal format with  , : "+number);
		System.out.println("");
		
		//use of % for percentage
		numFormat =  new DecimalFormat("%");
		number = numFormat.format(7);
		System.out.println("4. Decimal format with percentage : "+number);
		System.out.println("");
		
		//2 digit before decimal point and 2 digit after
		numFormat = new DecimalFormat("00.00");
		number = numFormat.format(-15.567);
		System.out.println("5. Decimal format with 4 digit : "+number);
		System.out.println("");
		
		//left part of decimal number
		numFormat = new DecimalFormat("##");
		number = numFormat.format(156.567);
		System.out.println("6. Decimal format with no decimal part : "+number);
		System.out.println("");
		
		//5 or less digit in the decimal part
		numFormat = new DecimalFormat("####");
		number = numFormat.format(1890.567);
		System.out.println("7. Decimal format with 5 or less digits : "+number);
		System.out.println("");
		
		//string 'JCG' in front of the number
		numFormat = new DecimalFormat("'JCG'000.#");
		number = numFormat.format(15.567);
		System.out.println("8. Decimal format with 'JCG' : "+number);
		System.out.println("");
		
	}
}		
		
		
package intermediate;

import java.text.*;
import java.util.*;

public class APIDate
{
	public static void main (String args[])
	{
		System.out.println("API Date Contructor..........");
		
		//Convert Date to string
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String sDate = sdf.format (new Date());
		System.out.println("Convert Date to String = "+sDate); // ---> 27/09/2018
		
		System.out.println("\n");
		//COnvert string ke Date
		sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateInString = "06-09-2018 15:37:56";
		Date date = new Date();
		try
		{
			date = sdf.parse(dateInString);
			System.out.println("Convert string ke Date = "+date);
			
		}
		catch(ParseException e1)
		{
			e1.printStackTrace();
		}
		System.out.println("\n");
		
		//dapatkan current date time 
		sdf = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
		date = new Date();
		System.out.println("Current date time : "+sdf.format(date));
		
		//Convert calendar ke date
		Calendar calendar = Calendar.getInstance();
		date = calendar.getTime();
		System.out.println("Convert calendar to date : "+date);
		
		//get current date time
		sdf = new SimpleDateFormat ("yyyy MMM dd HH:mm:ss");
		calendar = new GregorianCalendar(2018,8,27);
		System.out.println("Current date time : "+sdf.format(calendar.getTime()));
		
		//simple calendar contoh
		
		calendar = new GregorianCalendar();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayofMonth = calendar.get(Calendar.DAY_OF_MONTH);	//JAN= 0 DEC = 11
		int dayofWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekofYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekofMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		
		int hour = calendar.get(Calendar.HOUR);						// 12 HOURS
		int hourofDay = calendar.get(Calendar.HOUR_OF_DAY);			// 24 HOURS
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);
		
		System.out.println("Tahum \t\t\t\t : "+year);
		System.out.println("Bulan \t\t\t\t : "+(month+1));
		System.out.println("Hari \t\t\t\t : "+dayofMonth);
		System.out.println("Hari Keberapa dalam seminggu \t : "+dayofWeek);
		System.out.println("Minggu Keberapa dalam setahun \t : "+weekofYear);
		System.out.println("Minggu Keberapa dalam sebulan \t : "+weekofMonth);
		
		System.out.println("Jam \t\t\t\t : "+hour);
		System.out.println("Jam Keberapa dalam 1 hari \t : "+hourofDay);
		System.out.println("Menit \t\t\t\t : "+minute);
		System.out.println("Detik \t\t\t\t : "+second);
		System.out.println("Milli Detik \t\t\t : "+millisecond);
		
		System.out.println("\n");
		
		calendar = new GregorianCalendar(2018,8,27,16,18,20);
		System.out.println("#1. Set date manually : "+sdf.format(calendar.getTime()));
		
		//update a date
		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.MONTH, 9);
		//calendar.set(Calendar.MONTH, 9);
		
		System.out.println("#2. Set date manually : "+sdf.format(calendar.getTime()));
		
		//ADD or subtract from a date
		sdf = new SimpleDateFormat("yyyy MMM dd");
		calendar =  new GregorianCalendar(2018,8,27);
		System.out.println("Date : "+sdf.format(calendar.getTime()));
		
		//add one month
		calendar.add(Calendar.MONTH, 1);
		System.out.println("Add one month : "+sdf.format(calendar.getTime()));
		
		//subtract 10 hari
		calendar.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("Subtract 10 hari : "+sdf.format(calendar.getTime()));
		
		System.out.println("\n");
		
		//convert date to calendar
		sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		dateInString = "27-09-2018 16:34:45";
		try
		{
			date = sdf.parse(dateInString);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println("Convert Date to Calendar : "+calendar.getTime());
	}
}
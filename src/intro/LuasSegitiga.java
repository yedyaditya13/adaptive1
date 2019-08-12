package intro;

import java.util.*;

public class LuasSegitiga
{
	public static void main(String[] args)
	{
		LuasSegitiga ls = new LuasSegitiga();
		
		
		//luas = (alas *tinggi)/2;
		//System.out.println("Luas Segitiga :" + luas);
		
	}
	public LuasSegitiga()
	{
		welcome();
	}
	public void welcome()
	{
		int alas;
		int tinggi;
		double luas;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan alas :");
		alas =  input.nextInt();
		System.out.println("Masukkan tinggi :");
		tinggi =  input.nextInt();
		
		luas = (alas *tinggi)/2;
		System.out.println("Luas Segitiga :" + luas);
	}
}
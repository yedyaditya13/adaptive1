package basic;

import java.util.Scanner;

public class Array2
{
	public static void main(String args[])
	{
		
		int[] arrInt = null;
		Scanner input = new Scanner(System.in);
		System.out.println("\n");
		arrInt = new int[2];
		
		System.out.println("Jumlah Elemen Array : " + arrInt.length);
		System.out.println("\n");
		System.out.println("Sebelum Ditentukan Nilai Array");
		System.out.println("Elemen Ke-1 : " + arrInt[0] );
		System.out.println("Elemen Ke-2 : " + arrInt[1] );
		
		System.out.println("\n");
		System.out.println("Sesudah Ditentukan Nilai Array");
		arrInt[0] = 2;
		arrInt[1] = 5;
		System.out.println("Elemen Ke-1 : " + arrInt[0]);
		System.out.println("Elemen Ke-2 : " + arrInt[1]);
		
		
	}
}
import java.util.*;

public class SegitigaSiku{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);	
		System.out.println("Penghitung Pitagoras");
		double a,b,c;
		System.out.print("Masukkan nilai Vertical : ");
		a = input.nextDouble();
		System.out.print("Masukkan nilai Horizontal : ");
		b = input.nextDouble();
		
		System.out.println("\n");
		c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		System.out.println("Hasil segitiga adalah = "+c);
	}
}
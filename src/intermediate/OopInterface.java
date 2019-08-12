package intermediate;


public class OopInterface
{
	public static void main (String args[])
	{
		MatematikaImpl matematikaImpl = new MatematikaImpl();
		System.out.println("Segitiga -> Panjang : 2, Lebar : 6");
		System.out.println("Luas :"+matematikaImpl.luasSegitiga(2,6));
		
		System.out.println("\nPersegi Panjang -> Panjang : 2, Lebar : 6");
		System.out.println("Luas :"+matematikaImpl.luasPersegiPanjang(2,6));
	}
	
	
}
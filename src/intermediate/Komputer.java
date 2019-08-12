public class Komputer
{
	String merk ="SS";
	//int harga;
	
	public static void main (String args[])
	{
		Komputer kom = new Komputer();
		kom.setMerk("AA");
		System.out.print(kom.merk);
		
	}
	
	void setMerk(String merkBaru)
	{
		merk = merkBaru;
	}
	
}
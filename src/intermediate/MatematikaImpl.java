package intermediate;


public class MatematikaImpl implements IMatematika
{

	
	public double luasSegitiga(double panjang, double lebar)
	{
		return (panjang*lebar)/2;
	}
	public double luasPersegiPanjang(double panjang, double lebar)
	{
		return (panjang*lebar);
	}
	
	public double volumePrisma(double alas, double tinggi, double tinggiPrisma)
	{
		//return ((alas*tinggi)*tinggiPrisma)/2;
		//return (alas*tinggi*tinggiPrisma)/2;
		return (0.5*alas*tinggi)*tinggiPrisma;
	}
	//volumePrisma(double alas, double tinggi, double tinggiPrisma);
	
	public double volumeBola(int r)
	{
		double hasil = (((3.14*r*r*r)*4)/3);
		return hasil;
	}
	
}
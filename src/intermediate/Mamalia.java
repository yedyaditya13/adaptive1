package intermediate;


public class Mamalia
{
	private Integer umur;
	private String jenisKelamin;
	private String mamaliaTipeBesar;
	
	public Mamalia()
	{
		System.out.println("Mamalia Contructor.............");
	}
	
	public void setAttrMamalia(int umur, String jenisKelamin)
	{
		this.umur = umur;
		this.jenisKelamin = jenisKelamin;
	}
	
	public void voice()
	{
		System.out.println("Mamalia bersuaraa..........");
	}
	
	public void setUmur(Integer umur)
	{
		this.umur = umur;
	}
	public int getUmur()
	{
		return umur;
		
	}
	public void setJenisKelamin(String jenisKelamin)
	{
		this.jenisKelamin = jenisKelamin;
	}
	public String getJenisKelamin()
	{
		return jenisKelamin;
		
	}
	
}

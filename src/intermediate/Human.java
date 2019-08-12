package intermediate;


public class Human extends Mamalia
{
	private String nama;
	private String tempatTinggal;
	private String golDarah;
	
	public Human()
	{
		System.out.println("Human Contructor.............");
		super.voice();
	}
	
	public void human(int umur, String jenisKelamin)
	{
		System.out.println("Data diri saya adalah : ");
		setNama("Santo");
		System.out.println("Nama : "+nama);
		setTempatTinggal("Jakarta");
		System.out.println("Tempat Tinggal : "+tempatTinggal);
		setGolonganDarah("AB");
		System.out.println("Golongan Darah : "+golDarah);
		
		setAttrMamalia(umur,jenisKelamin);
		System.out.println("Umur : "+getUmur());
		System.out.println("Jenis Kelamin : "+getJenisKelamin());
		
	}
	
	public void voice()
	{
		System.out.println("Manusia berbicara..........");
	}
	public void setNama(String nama)
	{
		this.nama = nama;
	}
	public String getNama()
	{
		return this.nama;
	}
	
	public void setGolonganDarah (String golDarah)
	{
		this.golDarah = golDarah;
	}
	public String getGolonganDarah()
	{
		return this.golDarah;
	}
	public void setTempatTinggal (String tempatTinggal)
	{
		this.tempatTinggal= tempatTinggal;
	}
	public String getTempatTinggal()
	{
		return this.tempatTinggal;
	}
}
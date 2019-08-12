package intro;

public class Introduction
{
	private String nama = "Jojo";
	private int umur;
	
	public static void main(String[] args)
	{
		Introduction itr = new Introduction();
	}
	
	public Introduction()
	{
		setNama(nama);
		welcome();
	}
	
	public void setNama(String param)
	{	
		this.nama = param;
	}
	public void welcome()
	{
		System.out.println("Halo, nama saya adalah "+ nama);
	}
}
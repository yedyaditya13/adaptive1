package intermediate;


public class DataPribadi extends Human
{
	
	
	public static void main(String args[])
	{
		System.out.println("Data Pribadi Contructor.............");
		DataPribadi cls = new DataPribadi();
		cls.setDataPribadai();
		
	}
	
	public void setDataPribadai()
	{
		voice();
		human(36, "L");
	}
	
}
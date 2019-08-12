package advance.model;

public class SoalCoba 
{
	
	int kesempatan;
	private String jawab;
	private int score;
	private  int soalKe;
	private int banyakSoal;
	private	String a;
	
	SoalCoba()
	{
		start();
	}
	
	public void start()
	{
		kesempatan =2;
		score =0;
		soalKe=0;
		banyakSoal=kuis.length;
	}
	public void setJawab(String jawab)
	{
		this.jawab =jawab;
	}
	public String getJ()
	{
		return a;
		
	}
	
	private Kuis kuis[] = 
	{
		new Kuis("Berapakan 2+2 : ", "4"),
		new Kuis("Berapakan 2+3 : ", "5"),
		new Kuis("Berapakan 2+4 : ", "6"),
		new Kuis("Berapakan 2+5 : ", "7"),
		new Kuis("Berapakan 2+6 : ", "8")
		
	};
	
	
	
}
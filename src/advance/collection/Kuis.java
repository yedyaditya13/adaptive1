
package advance.model;

public class Kuis
{
	private String soal;
	private String jawaban;
	
	public Kuis(String soal, String jawab)
	{
		this.soal = soal;
		this.jawab = jawab;
	}
	
	public boolean cocokanJawaban(String jawab)
	{
		return this.jawab.equalsIgnoreCase(jawab);
	}
	
	public void setJawaban1(String jawaban)
	{
		this.jawaban = jawaban;
	}
	public String getJawaban()
	{
		return jawaban;
	}
	public void setSoal(String soal)
	{
		this.soal = soal;
	}
	public String getSoal()
	{
		return soal;
		
	}
	
}
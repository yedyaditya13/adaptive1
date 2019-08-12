public class ContohStatic
{
	public String namaPilot;
	public static int TotalTertembak = 0;
	
	public static void main(String args[])
	{
		ContohStatic pesawat = new ContohStatic();
		pesawat.pesawatTempur();
		
	}
	public int tembakmusuh()
	{
		TotalTertembak++;
		return TotalTertembak;
	}
	public void pesawatTempur()
	{
		ContohStatic F16 = new ContohStatic();
		F16.namaPilot = "Dedy";
		int hasilTembak1 = F16.tembakmusuh();
		System.out.println("Total Tertembak " + F16.namaPilot+" "+"="+" "+hasilTembak1);
		
		F16 = new ContohStatic();
		F16.namaPilot = "Abdul";
		int hasilTembak2 = F16.tembakmusuh();
		System.out.println("Total Tertembak " + F16.namaPilot+" "+"="+" "+hasilTembak2);
		
		System.out.print("Hasil Total Tertembak ="+" "+TotalTertembak);
	}
}
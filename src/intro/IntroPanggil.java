package intro;

public class IntroPanggil
{
	public static void main(String[]  args)
	{
		IntroPanggil intro = new IntroPanggil();
		intro.run();   // panggil cara 1
		intro.welcome();   //panggil cara 2
	}
	//public void run()   // method cara 1
	//{
		//welcome();
//	}
	public void welcome()
	{
		System.out.println("Selamat Datang di Pemograman kelas java!!");
	}
}
package intermediate;

public class BangunDatar 
{
    float sisi;
	//float luas;
    float luas(){
		float luas = sisi *sisi;	
        System.out.println("Menghitung luass bangun datar");
        return luas;
    }
    
    float keliling(){
		float keliling = 4*sisi;
        System.out.println("Menghitung keliling bangun datar");
        return keliling;
    }
    
}
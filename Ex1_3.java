package Lab;

public class Ex1_3 
{
	public static void main(String[] args) 
	{
		int[] mw = {89,174,132,133,121,146,75,155,131,131,146,149,165,115,105,119,204,181,117};
		String[] aa = {"Alanine","Arginine","Asparagine","Aspartic acid","Cysteine","Glutamine","Glycine","Histidine","Isoleucine","Leucine","Lysine","Methionine","Pheylalanine","Proline","serine","Threonine","Tryptophan","Tyrosine","Valine"};
		System.out.println("Aminoacid and its Molecular weight");
		for(int i=0; i< aa.length;i++)
		{
			System.out.println(aa[i] +":" +mw[i]);
		}
	}
}
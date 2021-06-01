package Lab;

public class Ex1_4 
{

	public static void main(String[] args)
	{
		String dna1 = "ACGTTTAGCTCCGAT";
		String dna2 = "AATTCCGGCCTTAACCGG";
		String DNA;
		DNA = dna1.concat(dna2);
		System.out.println("DNA1: " +dna1);
		System.out.println("DNA2: " +dna2);
		System.out.println("Concated DNA Sequence: " +DNA);
	}

}

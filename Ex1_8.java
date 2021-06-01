package Lab;

import java.util.Arrays;
import java.util.*;
public class Ex1_8 
{

	public static void main(String[] args) 
	{
		String[] aa = {"Glycine","Histidine","Isoleucine","Leucine","Lysine","Alanine","Arginine","Asparagine","Aspartic acid","Cysteine","Glutamine","Methionine","Pheylalanine","Proline","serine","Threonine","Tryptophan","Tyrosine","Valine"};
		Arrays.sort(aa);
		System.out.println(Arrays.toString(aa));
		Arrays.sort(aa, Collections.reverseOrder());
		System.out.println(Arrays.toString(aa));
	}

}

package Lab;

import java.util.Scanner;

public class Ex1_6 
{

	public static void main(String[] args) 
	{
		int n,i,f1=0,f2=1,temp;
		Scanner m=new Scanner(System.in);
		System.out.println("Series till which term: ");
		n =m.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print(f1 +",");
			temp = f1 + f2;
		    f1 = f2;
		    f2 = temp;
		}

	}

}

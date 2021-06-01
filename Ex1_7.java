package Lab;

import java.util.*;

public class Ex1_7 
{

	public static void main(String[] args)
	{
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=m.nextInt();
		double a[]= new double[n];
		int i;double average;
		double sum=0;
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the arrary values a["+i +"]:");
			a[i] =m.nextDouble();
		}
		for(i=0;i<n;i++)
		{
			sum= sum+a[i];
		}
		average=sum/n;
		System.out.println("Average value:" +average);
	}

	

}
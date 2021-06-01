package Lab;

import java.util.Scanner;

public class Ex1_5 
{

	public static void main(String[] args) 
	{
		float eng, phy, chem, math, bio; 
	     double total, average, percentage;
	    Scanner m =new Scanner(System.in);
	    System.out.println("Enter marks of five subjects");
	    System.out.print("Enter marks of English:");
	    eng=m.nextFloat();
	    System.out.print("Enter marks of physics:");
	    phy=m.nextFloat();
	    System.out.print("Enter marks of chemistry:");
	    chem=m.nextFloat();
	    System.out.print("Enter marks of maths:");
	    math=m.nextFloat();
	    System.out.print("Enter marks of Biology:");
	    bio=m.nextFloat();

	    
	    total = eng + phy + chem + math + bio;
	    average = (total / 5.0);
	    percentage = (total / 500.0) * 100;

	    
	    System.out.println("Total marks ="+total);
	    System.out.println("Average marks = "+average);
	    System.out.println("Percentage = "+percentage);
	    if(percentage>=50)
	    {
	    	System.out.println("Pass");
	    }

	}

}

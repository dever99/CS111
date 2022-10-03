
import java.util.*;
public class ticket 
{
	static double price;
	public static void main(String[]args)
	{
        Scanner scammer = new Scanner(System.in);
		int age;  
		double totpri; 
		System.out.print("What is your age? ");
		age = scammer.nextInt(); 
		System.out.print("Where did you buy the ticket? ");
		String loc = scammer.nextLine(); 
		
		if(age < 0 || age > 120)
		{
			System.out.println("invalid age");
		}
		else if(age <= 6 && age >= 0)
		{
			System.out.println("your ticket is free");
		}
		else 
		{
			if(age >= 70)
			{
				price = 5.20;
			}
			else
			{
				price = 11.50;
			}
		}
        if (loc.equalsIgnoreCase("Train Station"))
		{
			totpri = price;
			System.out.println(price);
		}
		else
		{
			totpri = price*1.15;
			System.out.println(totpri);
        }
	}

}

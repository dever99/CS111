/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Anirudh Deveram, ard238, ard238@scarletmail.rutgers.edu
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate 
{

    
    public static void main(String[] args) 
	{
		int valu = args.length; 
		int [] num; 
		num = new int[args.length]; 
		int f = 0; 
		while(f<args.length)
		{
			int numer = Integer.parseInt(args[f]); 
			f++; 
		}
		//System.out.println(valu);
		for(int k = 0; k < num.length; k++)
		{
			num[k] += Integer.parseInt(args[k]); 
		}
		boolean isDuplicate = false; 
		for(int i = 0; i < num.length; i++ )
		{
			for(int j = i+1; j < num.length; j++)
			{
				if(num[i] == num[j])
				{
				isDuplicate = true; 
				}
			}
		}
		System.out.println(isDuplicate); 

	


		
	}
}

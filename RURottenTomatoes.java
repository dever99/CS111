/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Anirudh Deveram, ard238, ard238@scarletmail.rutgers.edu
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes 
{

    public static void main(String[] args) 
	{
		int rate = args.length; 
		int z = 0; 
		int sumcols = 0; 
		int [] sumCol; 
		while( z < args.length)
		{
			int ratin = Integer.parseInt(args[z]); 
			z++; 
		}
		int rat [] [] = new int [Integer.parseInt(args[0])][Integer.parseInt(args[1])];
		int l = 2; 
		for(int r = 0; r < rat.length; r++)
		{
			for(int c = 0; c < rat[r].length; c++)
			{
				rat[r][c] = Integer.parseInt(args[l]); 
				l++; 
			}
		}
		// for(int i = 0; i < rat.length; i++)
		// {
		// 	for(int j = 0; j < rat[i].length; j++)
		// 	{
		// 		System.out.print(rat[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }
		sumCol = new int [rat[0].length];
		for(int i = 0; i < rat.length; i++)
        {
            for(int j = 0; j < rat[i].length; j++)
            {
                sumCol[j] += rat[i][j];    
            }
		}

	   int fin = 0; 
		
	//    for(int i = 0; i < sumCol.length; i++)
	//    {
	// 	System.out.print(sumCol[i]+" ");
	//    }
	   
	   //System.out.println();
	   int sum1; 
	   int sum2; 
	   int gInt = 0;  
	   for(int i = 0; i < sumCol.length; i++)
	   {
		   for(int j = i+1; j < sumCol.length; j++)
		   {
				sum1 = sumCol[i]; 
				sum2 = sumCol[j]; 
			
			   if(sum1 >= sum2 && sum1 > gInt)
			   {
				   fin = i; 
				   gInt = sum1; 
				 
			   }
			   else if(sum2 > sum1 && sum2 > gInt)
			   {
				   fin = j; 
				   gInt = sum2; 
			   }
		   }
		}
	   
	   System.out.println(fin); 

	}
}

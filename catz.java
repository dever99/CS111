import java.util.*;
public class catz 
{
	// the main method is the entry point to the program 
	//the interpreter will look for it to start execution 
	public static void main(String[]args)
	{
		//inputs to the program are passed through args 
		//args[0] has the first input, args[1] has the second input 
		Scanner heroin = new Scanner(System.in);
		//declare two integear variables 
		int anaCatz;
		int ellenCatz;
		anaCatz = Integer.parseInt(args[0]);
		ellenCatz = Integer.parseInt(args[1]);
		/*
		 * System.out.print("How many cats do you have Ana? ");
		 * anaCatz = heroin.nextInt();
		 * System.out.print("How many cats do you have Ellen? ");
		 * ellenCatz = heroin.nextInt();
		 * if(anaCatz > 0 || ellenCatz > 0 )
		 * {
		 *    System.out.println("Not possible, has to have cats.");
		 * }
		 * else
		 * {
		 * 		int totCatz = anaCatz + ellenCatz; 
		 * 		System.out.println("Total number of cats: "+totCatz);
		 * }
		 */
		// () around boolean expression 
		if(anaCatz < 0 || ellenCatz < 0)
		{
			//this part is executed if the boolean is true 
			System.out.println("ERROR");
		}
		else
		{
			//Executes if the number of cats is greater than 0 
			int totCatz = anaCatz + ellenCatz; 
			System.out.println("Total number of cats: "+totCatz);
		}
	}

}
// " " denotes a string
// ' ' denotes a char 